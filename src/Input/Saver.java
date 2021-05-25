package Input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Saver {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      boolean play = true;

      while (play) {
         System.out.println("1. 입력    2. 조회   3. 종료");
         int select = input.nextInt();

         switch (select) {
         case 1:
            input();
            break;
         case 2:
            search();
            break;
         case 3:
            play = false;
            break;
         default:
            System.out.println("Please enter 1 - 3.");
            break;
         }
      }
   }

   public static void input() {

      Date date = new Date();
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

      try {
         Scanner input = new Scanner(System.in);
         String txt = input.nextLine();
         
         System.out.println(txt);
         String insert = format.format(date) + "  " + txt + "\n";

         String fileName = "C:\\Users/User/workspace/test.txt";

         File file = new File(fileName);
         FileWriter fw = new FileWriter(file, true);
         fw.write(insert);
         fw.flush();
         fw.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void search() {
      try {
         String filePath = "C:\\Users/User/workspace/test.txt";
         FileInputStream fileStream = null;

         fileStream = new FileInputStream(filePath);
         byte[] readBuffer = new byte[fileStream.available()];
         while (fileStream.read(readBuffer) != -1) {
            System.out.println(new String(readBuffer));
         }
         fileStream.close();
      } catch (Exception e) {
         e.getStackTrace();
      }
   }
}