import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number;
        System.out.print("Enter the number:");
        number = s.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=number){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
