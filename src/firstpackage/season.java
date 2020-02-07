package firstpackage;
import java.util.Scanner;

    public class season {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter a interger number");
            int a = scanner.nextInt();
            if (a < 40 && a >= 20)
            {
                System.out.println("winter");
            }
            else if (a >= 40 && a <= 20) {
                System.out.println("fall");
            }
            else if(a>=40 && a<=60) {
                System.out.println("spring");
            }
            else{
            }
                System.out.println("summer");
        }
    }