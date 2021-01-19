import java.util.Scanner;

public class squarepattern{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>=0 && n<=50){
            int i = 0;
            while(i<n){
                int j = 1;
                while(j<n){
                    System.out.print(n);
                    j++;
                }
                System.out.println(n);
                i++;
            }
        }
    }
}