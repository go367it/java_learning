import java.util.Scanner;

public class Ncr {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int r = s.nextInt();

        int factN = 1;

        // loop for doing n factorial
        for(int i = 1; i<=n;i++){
            factN = factN * i;
        }

        // loop for doing r factorial
        int factR = 1;
        for(int i = 1;i<=r;i++){
            factR = factR * i;
        }

        //loop for doing the n-r factorial
        int factN_R = n-r;
        int N_r = 1;
        for(int i =1;i<=factN_R;i++){
            N_r = N_r * i;
        }

        int result = factN / (factR*N_r);

        System.out.println("Result is: "+ result);

    }
}
