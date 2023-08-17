package br.com.thiaago.trabalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1253 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> alphabet = getAlphabet();

        int numTest = scanner.nextInt();

        for (int i = 0; i < numTest; i++) {
            scanner.nextLine();

            String text = scanner.nextLine().toUpperCase();
            int cipherNum = scanner.nextInt();

            System.out.println(resolveCesarCipher(text, cipherNum, alphabet));
        }
    }

    private static List<Character> getAlphabet() {
        List<Character> alphabet = new ArrayList<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabet.add(ch);
        }
        return alphabet;
    }

    private static String resolveCesarCipher(String text, int cipherNum, List<Character> alphabet) {
        char[] chars = text.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (char aChar : chars) {
            int index = alphabet.indexOf(aChar);

            if (index + cipherNum >= alphabet.size())
                stringBuilder.append(alphabet.get((index + cipherNum) - (alphabet.size())));
            else
                stringBuilder.append(alphabet.get(index + cipherNum));
        }

        return stringBuilder.toString();
    }

}
