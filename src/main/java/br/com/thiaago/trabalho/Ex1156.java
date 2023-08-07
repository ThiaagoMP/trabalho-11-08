package br.com.thiaago.trabalho;

public class Ex1156 {

    public static void main(String[] args) {

        double s = 1.0;

        int iPrev = 0;
        int divPrev = 1;

        while(true) {
            iPrev += 2;

            if(iPrev>39)break;

            divPrev *= 2;

            s += iPrev / divPrev;
        }

        System.out.println(s);
    }

}
