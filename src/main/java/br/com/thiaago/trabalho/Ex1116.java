package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int counter = s.nextInt();
        int x;
        int y;
        double div;
        for (int i = 0; i < counter; i++) {
            x = s.nextInt();
            y = s.nextInt();
            div = Double.parseDouble(String.valueOf(x)) / Double.parseDouble(String.valueOf(y));
            if (y == 0)
                System.out.println("Não é possível dividir por 0");
            else
                System.out.println(" " + div);
        }
    }
}