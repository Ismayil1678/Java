package newclass;
import java.util.Scanner;
public class newloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter starting point:");
        int start=scanner.nextInt();
        System.out.print("enter end point:");
        int end=scanner.nextInt();
        System.out.print("what you what to print:");
        String print=scanner.next();
        for( int a=start;a<end;a++){
            System.out.println(print);
        }
    }
}
