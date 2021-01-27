import java.util.Scanner;

public class MirroImageNumberPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        if(n>=0 && n<=50){
            while(i<=n){
                int spaces = 1;
                while(spaces <= n-i){
                    System.out.print(' ');
                    spaces++;
                }
                int number = 1;
                while(number <= i){
                    System.out.print(number);
                    number++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
