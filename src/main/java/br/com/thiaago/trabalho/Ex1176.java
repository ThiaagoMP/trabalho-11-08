package br.com.thiaago.trabalho;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1176 {

    private static int fibonacci(int number) {
        if (number < 2)
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCounts = scanner.nextInt();

        int[][] x = new int[inputCounts][1];

        for (int i = 0; i < inputCounts; i++) {
            scanner.nextLine();

            int number = scanner.nextInt();
            x[i] = new int[]{fibonacci(number)};
        }

        System.out.println(Arrays.deepToString(x));
    }

}
