import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int a,b;

        System.out.print("Enter number a:");
        a = s.nextInt();

        System.out.print("Enter number b:");
        b = s.nextInt();

        if(a>b){
            System.out.println("a is greater");
        }
        else if(a==b){
            System.out.println("both the numbers are equal");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
