import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int number = n;
        int i = 0;
        if(n>=0 && n<=50){
            while(i<n){
                int j = 0;
                while(j<n-i){
                    System.out.print(number);
                    j++;
                }
                number--;
                System.out.println();
                i++;
            }
        }
    }
}
