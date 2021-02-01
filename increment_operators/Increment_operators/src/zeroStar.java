import java.util.Scanner;

public class zeroStar {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int limit = 2*n + 1;
        int i = 0;
        for(;i<n;i++){
            int j = 0;
            for(;j<limit;j++){
                if(i==j){
                    System.out.print('*');
                }
                else if(j == limit/2){
                    System.out.print('*');
                }
                else if(j == limit-i-1){
                    System.out.print('*');
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
