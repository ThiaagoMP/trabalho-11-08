package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;

public class Ex1142 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        for (int j = 1; j <= x * 4; j++) {
            if (j % 4 == 0)
                System.out.println("PUM \n");
            else
                System.out.print(j + " ");
        }
    }
}