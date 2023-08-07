package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;

public class Ex1134 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int x;
        int gas = 0;
        int alcool = 0;
        int diesel = 0;

        do {
            x = s.nextInt();
            if (x == 1)
                alcool++;
            else if (x == 2)
                gas++;
            else if (x == 3)
                diesel++;
            else if (x != 4) System.out.println("Insira um codigo valido");

        } while (x != 4);
        
        System.out.println("Muito obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + diesel);
    }
}