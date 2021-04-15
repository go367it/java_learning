import java.util.Scanner;

public class AddTwoNum {

    public static int _addTwoNum(int n1, int n2){

        return n1 + n2;

    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        // taking input from the user
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        System.out.println("Output: "+_addTwoNum(n1, n2));

    }
}
