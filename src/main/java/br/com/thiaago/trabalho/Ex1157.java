package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1157 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        for (int j = 1; j <= i; j++) {
            if(i%j == 0) System.out.println(j);
        }
    }

}
