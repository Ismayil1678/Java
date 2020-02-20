package udemy;
import java.util.Scanner;
public class ifelsetau {
    public static void main(String[] args) {
        int sale=10;
        System.out.println("how many sales they were short");
        Scanner scanner=new Scanner(System.in);
        int sales=scanner.nextInt();
        scanner.close();
        if(sale>=10) {
            System.out.println("congrats");
        }
         else{
                System.out.println("you  did not make");
    }
    }

}
