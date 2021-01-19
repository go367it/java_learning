import java.util.Scanner;

public class updatingRowValue {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int number = 1;
        while(i<=n){
            int j = 1;
            
            while(j<=n){
                if(j<=i){
                    if(i == 1){
                        System.out.print(number);
                    }else {
                        System.out.print(number+1);
                        number++;
                    }
                }
                
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
