import java.util.Scanner;

public class DivideTwoNum {

    public static int Divide(int n1, int n2){
        return n1/n2;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();

        System.out.println("result is: "+Divide(n1, n2));

    }
}
