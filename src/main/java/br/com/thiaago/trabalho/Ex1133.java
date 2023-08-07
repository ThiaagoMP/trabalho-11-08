package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;

public class Ex1133 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (i % 13 != 0) sum += i;
        }

        System.out.println(sum);
    }
}