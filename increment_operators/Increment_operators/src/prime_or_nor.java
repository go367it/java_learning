import java.util.Scanner;

public class prime_or_nor {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int count = 0;
        if(n>=1&&n<=100){
            for(;i<=n;i++){
            if(i==1){
                continue;
            }
                for(int j =2;j<i;j++){
                    
                    if(i%j == 0){
                        count++;
                    }
                }
                if(count == 0){
                    System.out.println(i);
                }
                count = 0;
            }
        }
        
    }
}
