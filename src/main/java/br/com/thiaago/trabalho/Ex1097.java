package br.com.thiaago.trabalho;

public class Ex1097 {

    public static void main(String[] args) {
        int i = 1;
        int j = 7;

        while (i < 10){
            for (int k = 0; k < 3; k++) {
                System.out.println("I="+i + " J="+j);
                j--;
            }
            i+=2;
            j+=5;
        }
    }

}
