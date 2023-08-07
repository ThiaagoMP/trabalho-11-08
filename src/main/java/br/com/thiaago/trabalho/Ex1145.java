package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1145 {
    
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        for(int i = 1; i <= y; i++){
            System.out.print(i + " " + (i % x == 0 ? "\n" : ""));
        }
    }
}
