package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;

public class Ex1113 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        while (x != y) {
            if (x > y)
                System.out.println("Decrescente");
            else
                System.out.println("Crescente");

            x = s.nextInt();
            y = s.nextInt();
        }

    }
}