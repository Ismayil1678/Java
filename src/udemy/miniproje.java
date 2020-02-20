package udemy;
import java.util.Scanner;
public class miniproje{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("world");
        int a=scanner.nextInt();
        System.out.println("world2");
        int b=scanner.nextInt();
        System.out.println("world3");
        int c=scanner.nextInt();
         int max=-1;
         if( a>=b && a>=c) {
             max = a;
             System.out.println("world1");
         }
         else if (b>=a && b>=c) {
             max = b;
             System.out.println("world");
         }
         else{
             max=c;
             System.out.println("max.."+max);

             }
         }
    }





