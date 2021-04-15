import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int number = n/2;
        int i = 0;
        int l =0;
        if(n>=0 && n<=50 && (n%2!=0)){
            while(i <= number){
                int j = 0;
                while(j <= number-i){
                    System.out.print(' ');
                    j++;
                }
                int k = 0;
                while(k <= i){
                    System.out.print('*');
                    k++;
                }
                int dec = i-1;
                while(dec>=0){
                    System.out.print('*');
                    dec--;
                }
                System.out.println();
                i++;
            }
            while(l<=number){

                int j = 0;
                while(j<=number){
                        System.out.print(' ');
                    
                    j++;
                }

                int dec = 0;
                while(dec<=number-l){
                        System.out.print('*');

                    dec++;
                }

                int inc = 0;
                while(inc<number-l){
                    System.out.print('*');
                    inc++;
                }

                System.out.println();
                l++;
            }
        }
        
    } 
}
