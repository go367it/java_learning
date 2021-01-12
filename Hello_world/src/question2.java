import java.util.Scanner;

public class question2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char ch = str.charAt(0);
        int n = (int)ch;
        if( n>=65 && n<=90 ){
            System.out.println(1);
        }
        else if( n>= 97 && n<=122){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }
    }
    
}

