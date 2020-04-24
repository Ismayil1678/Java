package newclass;
import java.util.Scanner;
public class ifproblem{
        public static void main(String []args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" what important computer need java/sql/could");
            String score = scanner.next();
            if (score.equalsIgnoreCase("java")) {
                System.out.println(" Java score( 0-100):");
                int java = scanner.nextInt();
                if (java >= 80) {
                    System.out.println("Nice job");
                } else {
                    System.out.println("I did it");
                }
            } else if (score.equalsIgnoreCase("sql")) {
                System.out.println("hackerrenk score");
                int heckerrank = scanner.nextInt();
                if (heckerrank > 500) {
                    System.out.println("it is good");
                } else {
                    System.out.println("try again");
                }
            } else if (score.equalsIgnoreCase("could")) {
                System.out.println("certificate(y/n)");
                String certificate = scanner.next();
                if (certificate.equalsIgnoreCase("Y")) {
                    System.out.println("good job");
                } else if (certificate.equalsIgnoreCase("N")) {
                    System.out.println("it is possible");
                } else {
                    System.out.println("yes or no");
                }
            }
             else {
                System.out.println("what computer need");
            }

        }
}