package newclass;

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter number");
        String score = scanner.next();
        String number = "five";
        switch ("number") {
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            default:
                System.out.println("only one-five");
                break;
        }    }   }