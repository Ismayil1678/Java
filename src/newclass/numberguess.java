package newclass;
import java.util.Scanner;
public class numberguess {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("enter first application or renewal:");
        String choise = myscan.next();
        int age = 16;
        if (age > 16) {
            System.out.println("Enter (F or R):");
            if (choise.equals("F")) {
                System.out.println("first id");
            } else if (choise.equals("R")) {
                System.out.println("driving license");
            } else {
                System.out.println("Take photo");
            }
        }   else{
                System.out.println("you can not apply");
            }
        }

    }






