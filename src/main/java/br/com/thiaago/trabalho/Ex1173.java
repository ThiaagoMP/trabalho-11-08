package br.com.thiaago.trabalho;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1173 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[10];

        int i = scanner.nextInt();
        for (int j = 0; j < x.length; j++) {
            x[j] = i;
            i *= 2;
        }
        System.out.println(Arrays.toString(x));
    }

}
