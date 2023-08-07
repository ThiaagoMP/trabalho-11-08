package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1075 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.println("Digite um inteiro menor que 10000");
            n = scanner.nextInt();
        } while (n >= 10000);

        for (int i = 0; i < 10000; i++) {
            if (i % n == 2) System.out.println(i);
        }

    }

}
