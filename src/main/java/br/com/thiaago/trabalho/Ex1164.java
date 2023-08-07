package br.com.thiaago.trabalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1164 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCounts = scanner.nextInt();


        for (int i = 0; i < inputCounts; i++) {
            scanner.nextLine();

            int x = scanner.nextInt();
            List<Integer> numbers = new ArrayList<>();

            for (int j = 1; j < x; j++) {
                if (x % j == 0) numbers.add(j);
            }

            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }

            if (sum == x) System.out.println(x + " eh perfeito");
            else System.out.println(x + " nao eh perfeito");
        }
    }

}
