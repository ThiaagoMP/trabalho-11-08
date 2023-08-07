package br.com.thiaago.trabalho;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1172 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[10];

        for (int i = 0; i < 10; i++) {
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] <= 0) x[i] = 1;
        }

        System.out.println(Arrays.toString(x));
    }

}
