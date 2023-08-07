package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;

public class Ex1117 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

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

        double media = (note1 + note2) / 2;
        System.out.println("Media = " + media);
    }
}