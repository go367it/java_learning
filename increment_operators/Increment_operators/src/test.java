import java.util.Scanner;

public class test {
public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int c = s.nextInt();
    int sum=0,product=1;
    if(c==1){
        int i = 1;
        for(;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
    else if(c==2){
        int i = 1;
        for(;i<=n;i++){
            product *= i;
        }
        System.out.println(product);
    }
    else{
        System.out.println(-1);
    }
}
}
