import java.util.Scanner;

public class Ncr {

    // function to calculate the factorial of the given number
    public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int r = s.nextInt();

        int factN = factorial(n);

        int factR = factorial(r);

        //loop for doing the n-r factorial
        int factN_R = factorial(n-r);

        int result = factN / (factR*factN_R);

        System.out.println("Result is: "+ result);

    }
}
