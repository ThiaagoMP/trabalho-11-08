package br.com.thiaago.trabalho;

import java.io.IOException;
import java.util.Scanner;

public class Ex1099 {
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
    	int x;
        int y;
        int sum;
        int n = s.nextInt();

        for(int i=0; i<n; i++){
            x = s.nextInt();
            y = s.nextInt();
            sum = 0;
            if (y>x) {
                for(int j = x + 1; j < y; j++){
                    if(j%2 != 0) sum += j;
                }
            } else {
                for(int j = 0; j < x; j++){
                    if(j%2 != 0) sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}