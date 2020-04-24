package newclass;
import java.util.Scanner;
public class outputquestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("math or art:");
        String answer = scanner.next();

        if(answer.equalsIgnoreCase("math")) {
            System.out.print("tutor(y/n):");
            String tutor=scanner.next();
            if(tutor.equalsIgnoreCase("y")) {
                System.out.println("ok");
            }
            else if(tutor.equalsIgnoreCase("n")){
                System.out.println("not ok");
            }
            else{
                System.out.println("please enter (y/n)");
            }
        }
            else if(answer.equalsIgnoreCase("Art")){
                System.out.println("Nice choice");
            }
             else{
            System.out.println("only math or art");
        }

    }
}
