package br.com.thiaago.trabalho;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1175 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
        }

        int[] newX = new int[10];

        for (int i = 0; i < x.length; i++) {
            newX[i] = x[x.length - i - 1];
        }

        System.out.println(Arrays.toString(newX));
    }

}
