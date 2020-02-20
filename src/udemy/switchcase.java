package udemy;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("number1");
                break;
            case 2:
                System.out.println("number2");
                break;
            case 3:
                System.out.println("number3");
                break;
            case 4:
                System.out.println("number4");
                break;
            default:
                System.out.println("no number");
        }
    }
}

