import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        if(n>=0 && n<=50){
            while(i <= n){
                int j = 1;
                while(j <= n-i){
                    System.out.print(' ');
                    j++;
                }
                int k = 0;
                while(k < i){
                    System.out.print(k+i);
                    k++;
                }
                int dec = k-1;
                while(dec>=1){
                    System.out.print(dec+i-1);
                    dec--;
                }
                System.out.println();
                i++;
            }
        }
    }
}
