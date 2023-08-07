package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1174 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] a = new double[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextDouble();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 10) System.out.println("A[" + i + "] = " + a[i]);
        }
    }

}
