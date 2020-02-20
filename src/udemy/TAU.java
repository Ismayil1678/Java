package udemy;
import java. util.Scanner;
public class TAU {
    public static void main(String[] args) {
        //get the a number hours worked
        System.out.println("enter the number of hour the employee work");
        Scanner scanner=new Scanner(System.in);
          int hours= scanner.nextInt();
        //get the you  pay rate
        System.out.println("enter you pay rate");
         double rate = scanner .nextDouble();
         scanner.close();
         //total hours and rate pay
        double Tau=hours * rate;
        //total result
        System.out.println("total pay$"+Tau);


    }
}
