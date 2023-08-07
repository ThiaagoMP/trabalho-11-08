package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1159 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 1;
        while (true) {
            x = Integer.parseInt(scanner.nextLine());

            if (x == 0) break;

            int count = 0;

            int sum = 0;

            while (count < 5) {
                if (x % 2 == 0) {
                    count++;
                    sum += x;
                }

                x++;
            }
            System.out.println(sum);
        }
    }

}
