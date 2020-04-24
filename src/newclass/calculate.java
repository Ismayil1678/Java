package newclass;
import java.util.Scanner;
    public class calculate {
        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Enter  electric consumption:");
            int consumption = Scanner.nextInt();
            double electricBill;
            if (consumption < 501) {
                electricBill = consumption * 0.3;
            } else if (consumption < 1001) {
                electricBill = consumption * 0.4;
            } else if (consumption < 2001) {
                electricBill = consumption * 0.5;
            } else {
                electricBill = consumption * 0.6;
            }
           // System.out.println(electricBill);
            System.out.format("$%.2f",electricBill);
        }


    }







