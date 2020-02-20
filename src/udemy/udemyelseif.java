package udemy;

import java.util.Scanner;
public class udemyelseif {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter you age");
        int age=scanner.nextInt();
        if(age==25){
            System.out.println("enter you age ");
        }
        else if(age<25){
            System.out.println("enter you age");
        }
        else if(age>25){
            System.out.println("enter you age");

        }
        else{
            System.out.println();
        }
    }
}
