package br.com.thiaago.trabalho;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1178 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[100];
        int t = scanner.nextInt();

        for (int i = 0; i < x.length; i++) {
            x[i] = t;
            t /= 2;
        }

        System.out.println(Arrays.toString(x));
    }

}
