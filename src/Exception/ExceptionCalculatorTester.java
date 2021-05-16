package Exception;
import java.util.Scanner;


public class ExceptionCalculatorTester {
   public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      boolean play = true;
      int num_1 = 0;
      int num_2 = 0;

      while (play) {
         while (play) {
            try {
               System.out.println("Please enter the first number.");
               String num = input.next();
               num_1 = Integer.parseInt(num);
               play = false;
            } catch (NumberFormatException e) {
               System.out.println("Number format exception");
               continue;
            }
         }

         play = true;
         while (play) {
            try {
               System.out.println("Please enter the second number.");
               String num = input.next();
               num_2 = Integer.parseInt(num);
               play = false;
            } catch (NumberFormatException e) {
               System.out.println("Number format exception");
               continue;
            }
         }

         int sum = num_1 + num_2;
         System.out.println(sum);
      }
   }
}