package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;

public class Ex1115 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int x;
        int y;
        do {
            x = s.nextInt();
            y = s.nextInt();
            if (x > 0 && y > 0)
                System.out.println("Primeiro Quadrante");
            else if (x > 0 && y < 0)
                System.out.println("Quarto Quadrante");
            else if (x < 0 && y > 0)
                System.out.println("Segundo Quadrante");
            else if (x < 0 && y < 0)
                System.out.println("Terceiro Quadrante");
        } while (x != 0 || y != 0);
    }

}