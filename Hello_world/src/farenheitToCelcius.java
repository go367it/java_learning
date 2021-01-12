import java.util.Scanner;

public class farenheitToCelcius {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int startValue, endValue, width;
        startValue = s.nextInt();
        endValue = s.nextInt();
        width = s.nextInt();
        if((startValue>=0 && startValue<=80)&&(endValue>=endValue && endValue<=900)&&(width>=0 && width<=40)){
            while(startValue <= endValue){
                int celciusValue = (startValue - 32) * 5/9;
                System.out.println(startValue + " " + celciusValue);
                startValue += width;
            }
        }
        
    }
}
