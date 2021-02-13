import java.util.Scanner;

public class Takingthroughfunctions {

    public static void printArray(int arr[]){
        int j = 0;
        int n = arr.length;
        System.out.println("Entered values");
        for(;j<n;j++){
            System.out.println(arr[j]);
        }
    }

    public static int[] takingInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i = 0;
        for(;i<n;i++){
            System.out.print("Enter the "+(i+1)+" number :");
            arr[i] = s.nextInt();
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args){
        int arr[] = takingInput();
        printArray(arr);
    }
}
