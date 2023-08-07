package br.com.thiaago.trabalho;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1179 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pair = new int[5];
        int[] odd = new int[5];

        int countPair = 0;
        int countOdd = 0;

        for (int i = 0; i < 15; i++) {
            int number = scanner.nextInt();

            if (number == 0) continue;

            if (number % 2 == 0) {
                if (countPair >= 4) {
                    System.out.println(Arrays.toString(pair));
                    Arrays.fill(pair, 0);
                    countPair=0;
                }
                pair[countPair] = number;
                countPair++;
            } else {
                if (countOdd >= 4) {
                    System.out.println(Arrays.toString(odd));
                    Arrays.fill(odd, 0);
                    countOdd=0;
                }
                odd[countOdd] = number;
                countOdd++;
            }
        }

        System.out.println(Arrays.toString(pair));
        System.out.println(Arrays.toString(odd));
    }

}
