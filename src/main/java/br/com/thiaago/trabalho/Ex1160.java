package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1160 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCounts = scanner.nextInt();

        for (int i = 0; i < inputCounts; i++) {
            scanner.nextLine();
            String[] input = scanner.nextLine().split(" ");

            int years = resolve(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3]));
            if (years >= 100)
                System.out.println("Mais que 1 seculo");
            else
                System.out.println(years + " anos");
        }
    }

    private static int resolve(int populationA, int populationB, double percentA, double percentB) {
        if (populationA > populationB) {
            System.out.println("População de A já é maior que população de B");
            return 0;
        }

        int counter = 0;
        while (populationA <= populationB || counter >= 100) {
            populationA += (populationA * percentA) / 100;
            populationB += (populationB * percentB) / 100;
            counter++;
        }
        return counter;
    }

}
