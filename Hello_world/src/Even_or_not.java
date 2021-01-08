import java.util.Scanner;

public class Even_or_not {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("Enter the number to check:");
        a = s.nextInt();

        if((a%2)==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

    }
}
