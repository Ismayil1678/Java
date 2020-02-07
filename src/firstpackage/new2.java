package firstpackage;
import java.util.Scanner;
   public class new2 {
       public static void main(String[] args) {
           Scanner scanNumber = new Scanner(System.in);
           int a = scanNumber.nextInt();
           int b = scanNumber.nextInt();
           int c = scanNumber.nextInt();

           if ((a + b > c) && (a + c > b) && (b + c > a)) {
           System.out.println("can from triangle");
       }else{
           System.out.println("can not from traingle");
       }

   }
}