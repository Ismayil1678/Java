package newclass;
import java.util.Scanner;
public class carprice {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("which model?(x+y ");
    String model= scanner.next();
    int MSRP=0;
    if(model.equals("X")){
        MSRP=3000;
        System.out.println("do you want package?:x/y");
        String body=scanner.next();
        if(body.equalsIgnoreCase("y")){
            MSRP=MSRP+5000;
            System.out.println(" do you want sound system?:(x/y");
            String sound=scanner.next();
            if(sound.equalsIgnoreCase("y")){
                MSRP+=3000;
            }
        else if (model.equals("y")){
                MSRP = 3500;
            }
        else {
            System.out.print("$+MSRP");


                }

        }
    }



    }
}
