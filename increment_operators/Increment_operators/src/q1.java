import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean b;
        for(int i =1; i<=n; i++){
            for(int j = n; j>0;j--){
                if(j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }   
            }
            System.out.println();
        }
    }
}
