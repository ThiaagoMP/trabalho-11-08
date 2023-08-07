package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1149 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int n = s.nextInt();
        int sum = 0;
        while (n <= 0) {
        	n = s.nextInt();
        }
        for (int i = 1; i <= n; i++) {
        	sum += a;
        	a++;
        }
        System.out.println(sum);


    }
    
}
