package Exception;
import java.util.Scanner;

public class ExceptionTesterOdd {
   public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      int num = 0;

      boolean play = true;

      while (play) {
         try {
            System.out.println("Please enter a number");
            String number = input.next();
            num = Integer.parseInt(number);
         } catch (NumberFormatException e) {
            System.out.println("Number format exception");
            continue;
         }

         try {
            if (num % 2 == 1) {
               throw new MyException("It is an odd number.");
            }
            else {
            	System.out.println("It is an even number");
            }
         } catch (MyException my) {
            System.out.println(my.getMessage());
            play = false;
         }
      }
   }
}