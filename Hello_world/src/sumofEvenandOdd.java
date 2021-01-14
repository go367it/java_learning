import java.util.Scanner;

public class sumofEvenandOdd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int length = String.valueOf(n).length();
        if(n>=0 && n<=100000000){
            int i =0;
            int number,even=0,odd=0;
            while(i<length){
                number = n%10;
                n = n/10;
                if(number%2 == 0){
                    even += number;
                }else{
                    odd += number;
                }
                i++;
            }
            System.out.println(even + " " + odd);
        }
    }
}
