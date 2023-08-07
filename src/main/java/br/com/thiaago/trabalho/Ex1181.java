package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1181 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] m = new int[2][2];

        int line = scanner.nextInt();
        scanner.nextLine();

        boolean isAverage = scanner.nextLine().equals("M");

        for (int i = 0; i < m.length; i++) {
            int[] newArray = new int[12];

            for (int j = 0; j < newArray.length; j++) {
                newArray[j] = scanner.nextInt();
            }

            m[i] = newArray;
        }

        int[] lineArray = m[line];

        int sum = 0;
        for (int j : lineArray) {
            sum += j;
        }

        if (isAverage) sum /= lineArray.length;

        System.out.println(sum);
    }
}