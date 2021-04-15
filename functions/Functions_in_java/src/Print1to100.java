
// program to print the even number from 1 to 100

public class Print1to100 {

    public static void printAllEven(){
        int n = 100;

        //loop for printing the value
        for(int i =1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args){
        printAllEven();
    }
}
