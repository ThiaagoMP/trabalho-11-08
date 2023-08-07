package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1180 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        int[] x = new int[i];

        for (int j = 0; j < x.length; j++) {
            x[j] = scanner.nextInt();
        }

        int smaller = Integer.MAX_VALUE;
        int pos = 0;
        for (int j = 0; j < x.length; j++) {
            if (j < smaller){
                smaller = x[j];
                pos = j;
            }
        }

        System.out.println("Menor: " + smaller);
        System.out.println("Pos: " + pos);
    }

}
