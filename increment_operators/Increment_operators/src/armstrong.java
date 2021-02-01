import java.util.Scanner;

public class armstrong {
    public static void main(String[] args)
   {
      int x, y, z = 0, temp;
      Scanner sc = new Scanner(System.in);
      x = sc.nextInt();
      temp = x;
      while(x > 0)
      {
         y = x % 10;
         x = x / 10;
         z = z + (y * y * y);
      }
      if(temp == z)
      {
         System.out.println(true);
      }
      else
      {
         System.out.println(false);
      }
      sc.close();
   }
}
