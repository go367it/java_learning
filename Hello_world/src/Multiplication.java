import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=10){
            if(n>=0 && n<=10000){
                System.out.println(n*i);
                i++;
            }
            else{
                return;
            }
        }
    }
}
