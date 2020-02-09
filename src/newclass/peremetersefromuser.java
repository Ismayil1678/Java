package newclass;
import java.util.Scanner;
public class peremetersefromuser {
    public  static void main(String[]args){
        Scanner myscan=new Scanner(System.in);
        System.out.println("Please enter C;R orT:");
        String shape=myscan.next();
        if( shape.compareToIgnoreCase("c")==0){
            System.out.println("radius :");
            int r = myscan.nextInt();
            System.out.println(2*3.14);
        }
        else if(shape.compareToIgnoreCase("r")==0){
            System.out.println("Enter widht");
            int width=myscan.nextInt();
            System.out.println("Enter height");
            int height=myscan.nextInt();
            System.out.println(2*(width+height));

        }
        else if (shape.compareToIgnoreCase("t")==0 ){
            System.out.println("edge1");
            int edge1=myscan.nextInt();
            System.out.println("edge2");
            int edge2=myscan.nextInt();
            System.out.println("edge3");
            int edge3=myscan.nextInt();
            System.out.println(edge1+edge2+edge3);



        }
        else{
            System.out.println("Plese enter C,R or T");
        }
    }
}
