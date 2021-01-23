import java.util.Scanner;

public class AlphabetPattern4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 0;
        if(n>=0 && n<=26){
            while(i<n){
                int j = 0;
                int n2 = n;
                while(j<=n){
                    if(j<=i){
                        char value = (char)(('A'+n-i-1)+(j));
                        System.out.print(value);
                    }
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
