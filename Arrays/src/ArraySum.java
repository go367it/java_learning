import java.util.Scanner;

public class ArraySum {

    // taking input from the user
    public static int[] takingInput(){
        Scanner s = new Scanner(System.in);
        int[] arr;
        int t = s.nextInt();

        if(t>=1 && t<=100){
            arr = new int[t]; // setting the limit of the array
            int i = 0; // setting the initial value of the array
            for(;i<t;i++){
                int n = s.nextInt(); // for getting the limit of the array
                int newArr[] = new int[n];
                if(n>=0 && n<=100000){
                    int j = 0; // setting the irst value of the array
                    for(;j<n;j++){
                        newArr[i] = s.nextInt();
                    }
                }
                
            }
        }
        
        return arr;
    }
    
    public static void main(String[] args){
      int arr[] = takingInput();
    }
}
