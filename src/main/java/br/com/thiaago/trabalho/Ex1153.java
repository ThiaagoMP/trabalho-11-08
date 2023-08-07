package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1153 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        int multiplication = 1;

        for (int j = i; j > 0; j--) {
            multiplication *= j;
        }

        System.out.println(multiplication);
    }

}
