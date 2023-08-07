package br.com.thiaago.trabalho;

import java.util.*;

enum AnimalType {

    MOUSE('R'), FROG('S'), RABBIT('C');

    AnimalType(char type) {
        this.type = type;
    }

    private char type;

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}

public class Ex1094 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de entradas: ");
        int numberInputs = scanner.nextInt();
        scanner.nextLine();

        HashMap<AnimalType, Integer> animals = new HashMap<>(Map.of(AnimalType.MOUSE, 0, AnimalType.FROG, 0, AnimalType.RABBIT, 0));

        for (int i = 0; i < numberInputs; i++) {
            String[] input = scanner.nextLine().split(" ");

            int number = Integer.parseInt(input[0]);
            char type = input[1].toUpperCase().charAt(0);

            Optional<AnimalType> first = Arrays.stream(AnimalType.values()).filter(animalType -> animalType.getType() == type).findFirst();

            if (first.isEmpty()) {
                System.out.println("Input errado!");
                return;
            }
            animals.put(first.get(), animals.get(first.get()) + number);
        }

        double total = animals.get(AnimalType.FROG) + animals.get(AnimalType.MOUSE) + animals.get(AnimalType.RABBIT);

        System.out.println("Total: " + total);
        System.out.println("Total de sapos: " + animals.get(AnimalType.FROG));
        System.out.println("Total de ratos: " + animals.get(AnimalType.MOUSE));
        System.out.println("Total de coelhos: " + animals.get(AnimalType.RABBIT));
        System.out.println("Percentual de sapos: " + Double.parseDouble(String.valueOf(animals.get(AnimalType.FROG))) / total * 100 + "%");
        System.out.println("Percentual de ratos: " + Double.parseDouble(String.valueOf(animals.get(AnimalType.MOUSE))) / total * 100 + "%");
        System.out.println("Percentual de coelhos: " + Double.parseDouble(String.valueOf(animals.get(AnimalType.RABBIT))) / total * 100 + "%");
    }

}
