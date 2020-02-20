package udemy;
import java.util.Scanner;
public class costh {
   /* public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number_1 ;
        int number_2;
        System.out.println("number_1");
        number_1= scanner.nextInt();
        System.out.println("number_2");
        number_2=scanner.nextInt();
        System.out.println("number_1:"+number_1+"number_2:"+number_2);
        int java=number_1;
        number_1=number_2;
        number_2=java;
        System.out.println("number_1:"+number_1+"number_2:"+number_2);
    }*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x;
        int y;
        System.out.print("x:");
         x=scanner.nextInt();
        System.out.print("y :");
        y=scanner.nextInt();
       /* float java=x*x+y*+y;
        System.out.print("java"+java);*/

        double corner=Math.sqrt(x*x+y*y);
        System.out.print("corner"+corner);
        }


    }

