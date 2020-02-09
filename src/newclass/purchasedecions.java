package newclass;
import java.util.Scanner;
   public class purchasedecions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter blue or red");
        String color = scanner.next();
        System.out.println("tag price");
        int price=scanner.nextInt();
        System.out.println("enter discount(0.1-0.5)");
        int p=20;
        int d=10;
        if (p>= 100){
            System.out.println("dont buy");
        } else if (p >= 50 && p <= 99) {
            System.out.println(" buy later ");
        }
        else if(p<=50 && p<=30) {
            System.out.println(" buy now");
        }
        else{
        }
        System.out.println("");
    }
}
