package newclass;
import java.util.Scanner;
    public class calculate {
        public static void main( String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a electric used in kw");
        int a = scanner.nextInt();
        int z=600;
        if (z < 500){
            System.out.println("electric*0.3");
        } else if (z >= 500 && z <= 1000) {
            System.out.println(" electric*0.4");
        }
        else if(z>=1000 && z<=2000) {
            System.out.println("electric*0.5");
        }
        else{
        }
        System.out.println("0.6");
    }

}







