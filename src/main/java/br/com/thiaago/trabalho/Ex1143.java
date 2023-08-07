package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Ex1143 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        for(int i = 1; i <= x; i++){
            System.out.println(i + " " + Double.valueOf(Math.pow(i, 2)).intValue() + " " +  Double.valueOf(Math.pow(i, 3)).intValue());
        }
    }
}