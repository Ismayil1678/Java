package newclass;
import java.util.Scanner;
public class ifproblem{
        public static void main(String []args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" what importand computer need java/sql/could");
            String score = scanner.next();
            if (score.equals("java")) {
                System.out.println("score 0-100");
            } else if (score.equals("sql")) {
                System.out.println("hackerrenk score");
            } else if (score.compareToIgnoreCase("could") == 0) {
                System.out.println("score");
            } else {
                System.out.println("what computer need");
            }

        }
}