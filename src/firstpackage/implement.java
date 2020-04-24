package firstpackage;
import java.util.Scanner;
public class  implement {
    public static void main(String[] args) {
        Scanner myscanner=new Scanner(System.in);
        System.out.print("Enter you milenium year:");
        int year=myscanner.nextInt();
        if(year>1999) {
            System.out.println("After milenim");
        }   else{
            System.out.println("Before milenim");
            }


    }
}
