package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;

public class Ex1131 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int gremioTotal = 0;
        int interTotal = 0;
        int tie = 0;

        while (true) {
            System.out.println("novo grenal \n 1 - sim 2- nao");

            if (s.nextInt() != 1) break;

            int inter = s.nextInt();
            int gremio = s.nextInt();

            if (inter > gremio)
                interTotal++;
            else if (gremio > inter)
                gremioTotal++;
            else tie++;

        }

        System.out.println("Empates: " + tie);
        System.out.println("Inter: " + interTotal);
        System.out.println("Gremio: " + gremioTotal);

        if (interTotal > gremioTotal)
            System.out.println("Inter venceu mais");
        else if (gremioTotal > interTotal)
            System.out.println("Gremio venceu mais");
        else System.out.println("Nao houve vencedor");
    }
}
