import java.util.Scanner;

public class Ex1146 {
    
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int x;
        while(true){
            x = s.nextInt();
            if(x==0)break;
            for (int i = 1; i <= x; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
