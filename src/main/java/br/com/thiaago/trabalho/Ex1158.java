package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1158 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < counter; i++) {
            String input = scanner.nextLine();

            int x = Integer.parseInt(input.split(" ")[0]);
            int y = Integer.parseInt(input.split(" ")[1]);

            int count = 0;

            int sum = 0;

            while (count < y) {
                if (x % 2 != 0) {
                    count++;
                    sum += x;
                }

                x++;
            }
            System.out.println(sum);
        }
    }

}
