package br.com.thiaago.trabalho;

public class Ex1096 {

    public static void main(String[] args) {
        int i = 1;
        int j = 7;

        while(i < 10){
            System.out.println("I="+i + " J="+j);
            if(j == 5){
                j = 7;
                i+=2;
                continue;
            }
            j--;
        }
    }

}
