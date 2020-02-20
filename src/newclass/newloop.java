package newclass;
import java.util.Scanner;
public class newloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter statring point");
        int start=scanner.nextInt();
        System.out.println("enter end point");
        int end=scanner.nextInt();
        System.out.println("what you what to print");
        for( int a=0;a<15;a++){
            System.out.println( a);
        }
    }
}
