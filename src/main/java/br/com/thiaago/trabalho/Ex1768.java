package br.com.thiaago.trabalho;

import java.util.Scanner;

public class Ex1768 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int nDiv = n / 2;

        for(int i = 0; i<= n; i++){
            if(i%2 == 0) continue;

            nDiv = printSpace(nDiv);
            printCharacters(i);
            System.out.println();
        }
        printBase(n / 2);
    }


    private static void printCharacters(int n){
        for(int i = 0; i<n; i++){
            System.out.print("*");
        }
    }

    private static int printSpace(int n){
        for(int i = 0; i<n;i++){
            System.out.print(" ");
        }
        return n-1;
    }

    private static void printBase(int nDiv){
        for(int i = 0; i<= 4; i++){
            if(i%2 == 0) continue;

            nDiv = printSpace(nDiv);
            printCharacters(i);
            System.out.println();
        }

    }

}
