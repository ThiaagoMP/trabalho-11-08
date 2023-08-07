package br.com.thiaago.trabalho;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex1079 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantia de estudantes: ");
        int numberStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberStudents; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1));

            String note = scanner.nextLine().replace(',','.');
            String[] noteSplit = note.split(" ");

            List<Double> notesDouble = Arrays.stream(noteSplit).map(Double::parseDouble).toList();

            double average = notesDouble.stream().mapToDouble(noteInteger -> noteInteger).sum();

            System.out.printf("Media: %.2f\n", average / notesDouble.size());
        }
    }

}
