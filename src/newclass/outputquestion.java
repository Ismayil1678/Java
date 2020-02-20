package newclass;
import java.util.Scanner;
public class outputquestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("math or art");
        String answer = scanner.next();
        if(answer.equals("math")){
            System.out.println("tutor y/n");
            String tutor=scanner.nextLine();


        }

    }
}
