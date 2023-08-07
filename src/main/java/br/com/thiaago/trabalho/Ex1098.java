package br.com.thiaago.trabalho;

public class Ex1098 {

    public static void main(String[] args) {
        double i = 0;
        double j = 0;

        while (i < 2.0){
            for (int k = 0; k < 3; k++) {
                j+=1.0;
                System.out.printf("I=%.1f J=%.1f\n",i,j);
            }
            i+=0.2;
            j+=0.2;
            j-=3.0;
        }
    }

}
