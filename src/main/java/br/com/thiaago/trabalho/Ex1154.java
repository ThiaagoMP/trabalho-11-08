package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1154 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double agesSum = 0.0;
        int counter = 0;

        while (true) {
            double age = Double.parseDouble(scanner.nextLine().replace(',', '.'));

            if (age < 0) break;

            agesSum += age;
            counter++;
        }

        System.out.printf("%.2f", agesSum / counter);
    }

}
