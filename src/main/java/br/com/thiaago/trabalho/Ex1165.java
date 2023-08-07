package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1165 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCounts = scanner.nextInt();

        for (int i = 0; i < inputCounts; i++) {
            scanner.nextLine();
            int x = scanner.nextInt();

            boolean cousin = true;

            for (int j = 2; j < x; j++) {
                if (x % j == 0) {
                    cousin = false;
                    break;
                }
            }

            System.out.println(cousin ? x + " eh primo" : x + " nao eh primo");
        }
    }

}
