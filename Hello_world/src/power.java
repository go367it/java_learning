import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x,n;
        x = s.nextInt();
        n = s.nextInt();
        if(n == 0){
            System.out.println(1);
            return;
        }
        if(n == 1){
            System.out.println(x);
            return;
        }
        int answer = x;
        int i = 2;
        while(i<=n){
            answer = answer * x;
            i++;
        }
        System.out.println(answer);
    }
}
