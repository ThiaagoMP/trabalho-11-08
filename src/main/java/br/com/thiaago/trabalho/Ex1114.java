import java.io.IOException;
import java.util.Scanner;

public class Ex1114 {
    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(System.in);

        int pass = s.nextInt();

        while (pass != 2002) {
            System.out.println("pass invalida, tente novamente");
            pass = s.nextInt();
        }

        System.out.println("acesso permitido");
    }
}