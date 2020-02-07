package firstpackage;
import java.util.Scanner;
      public class task {
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.println(" Enter a interger number");
              int num = scanner.nextInt();
              int remainder = num % 2;
              if (remainder == 1) {
                  System.out.println("odd");
              } else {
                  System.out.println("even");
              }
          }
      }