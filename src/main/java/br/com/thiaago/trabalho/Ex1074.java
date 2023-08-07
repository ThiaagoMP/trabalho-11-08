package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1074 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um inteiro: " );
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite outro inteiro: ");
            int numberRead = scanner.nextInt();
            if(numberRead == 0 ) {
                System.out.println("NULL");
                continue;
            }
            System.out.println(((numberRead % 2 == 0) ? "Par " : "Impar ") + ((numberRead > 0) ? "Positivo" : "Negativo"));
        }
    }

}
