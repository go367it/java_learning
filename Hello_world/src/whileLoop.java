import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int limit;
        System.out.print("Enter the limit:");
        limit = s.nextInt();
        int i = 0;
        while(i<limit){
            System.out.println("Hello");
            i = i + 1;
        }
    }
}
