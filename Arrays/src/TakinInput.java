import java.util.Scanner;

public class TakinInput {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i = 0;
        for(;i<n;i++){
            System.out.print("Enter the "+(i+1)+" number :");
            arr[i] = s.nextInt();
            System.out.println();
        }
        int j = 0;
        System.out.println("Entered values");
        for(;j<n;j++){
            System.out.println(arr[j]);
        }
    }
}
