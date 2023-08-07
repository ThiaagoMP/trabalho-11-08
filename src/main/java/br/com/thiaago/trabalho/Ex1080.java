package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1080 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int high = Integer.MIN_VALUE;
        int pos = 0;
        for (int i = 1; i <= 10; i++) {
            int newNumber = scanner.nextInt();
            if(high < newNumber) {
                high = newNumber;
                pos = i;
            }
        }
        System.out.println("Maior numero: " + high);
        System.out.println("Posiçao de entrada: " + pos);
    }

}
