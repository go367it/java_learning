import java.util.Scanner;



public class totalSalary{

    public static void calculateSalary(int basic, char grade){
        float hra;
        float da;
        float pf;
        float convertedBasic = (float)basic;
        int range = (int)grade;
        int allow;
        hra = convertedBasic * 20/100;
        da = convertedBasic * 50/100;
        pf = convertedBasic * 11/100;
        if(range>=65 && range<=90){
            if(grade == 'A'){
                allow = 1700;
            }else if(grade == 'B'){
                allow = 1500;
            }else{
                allow = 1300;
            }
            float total = hra+da+allow - pf;
            float totalSalary = convertedBasic + total;
            int convertedSalary = (int)Math.round(totalSalary);
            System.out.println(convertedSalary);
        }
    }
    
    public static void main(String[] args){

        int basic;
        char grade;
        Scanner s = new Scanner(System.in);
        basic = s.nextInt();
        String str = s.next();
        grade = str.charAt(0);

        calculateSalary(basic, grade);
    }
}