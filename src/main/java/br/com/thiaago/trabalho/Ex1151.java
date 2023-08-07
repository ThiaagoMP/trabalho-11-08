package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1151 {

    private static long fibonacci(int number) {
        if (number < 2)
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println(fibonacci(i));
        }
    }

}
