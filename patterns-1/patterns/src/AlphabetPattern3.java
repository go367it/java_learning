import java.util.Scanner;

public class AlphabetPattern3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        if(n>=0 && n<=13){
            while(i<n){
                int j = 0;
                while(j<n){
                    if(j<=i){
                        char value = (char)('A'+i+j);
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
