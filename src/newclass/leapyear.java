package newclass;
import java.util.Scanner;
    public class leapyear {
        public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a java: ");
        int java = scanner.nextInt();
        if ( java<=0 && java<=50) {
            System.out.println("fail");
        }
        else if(java>50 && java<59) {
            System.out.println("D");
        }
        else if(java>60&& java<69) {
            System.out.println("C");
        }
        else if(java>70&& java<79) {
            System.out.println("B");
        }
        else if(java>80&& java<89) {
            System.out.println("A");
        }
        else if(java>90&& java<100) {
            System.out.println("A+");
        }
        else
            System.out.println("don t java");

        }

          }



