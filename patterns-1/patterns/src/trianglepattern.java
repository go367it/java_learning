import java.util.Scanner;

public class trianglepattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        if(n>=0 && n<=50){
            while(i<=n){
                int j = 0;
                while(j<n){
                    if(j<i){
                        
                        if(j==0){
                            System.out.print(i);
                        }else{
                            System.out.print(i-j);
                        }
                    }
                    
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
