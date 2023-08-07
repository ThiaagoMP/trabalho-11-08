package br.com.thiaago.trabalho;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1177 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[1000];
        int t = scanner.nextInt();

        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            if (counter >= t) counter = 0;
            x[i] = counter;
            counter++;
        }

        System.out.println(Arrays.toString(x));
    }

}
