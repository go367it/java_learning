import java.util.Scanner;

public class AlphabetPatterns{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<n){
                char value = (char)('A'+j);
                System.out.print(value);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}