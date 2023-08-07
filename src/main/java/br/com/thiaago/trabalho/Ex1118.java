package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;

public class Ex1118 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int i = 1;
        while (i == 1) {
            double note1 = s.nextDouble();
            double note2;

            while (note1 < 0 || note1 > 10) {
                System.out.println("Nota invalida");
                note1 = s.nextDouble();
            }

            note2 = s.nextDouble();
            while (note2 < 0 || note2 > 10) {
                System.out.println("Nota invalida");
                note2 = s.nextDouble();
            }

            double average = (note1 + note2) / 2;
            System.out.println("average = " + average);

            System.out.println("Novo calculo? \n 1 - Sim 2 - Nao");
            i = s.nextInt();

        }

    }
}