import java.util.Scanner;

public class factors {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>=0 && n<=10000){
            if(n==0 || n==1){
                return;
            }
            int i = 2;
            while(i<=n/2){
                if(n%i == 0){
                    System.out.print(i+" ");
                }
                i++;
            }
        }
    }
}
