package udemy;
import java.util.Scanner;
public class elevenfebrarury {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int number_1;
        int number_2;
        System.out.print("number_ 1");
         number_1=scanner.nextInt();
          System.out.println("number_2");
         number_2=scanner.nextInt();
        System.out.println("number: 1"+ number_1 + "nember: 2" +number_2);

         int after= number_1;
         number_2= after;
         number_2=number_1;

        System.out.println("after change....");
        System.out.println("number: 1" +number_1+ "number: 2"  +number_2);
    }

}
