package newclass;
import java.util.Scanner;
public class consumption {
    public static void main(String[]args){
        Scanner myScanner=new Scanner(System.in);
        System.out.println("enter you consumption");
        int myConsumption= myScanner.nextInt();
        double electricbill;
        if(myConsumption<501) {
            electricbill = myConsumption * 0.3;
        }
            else if(myConsumption<1000) {
              electricbill = myConsumption * 0.4;
        }
             else if(myConsumption<2000) {
            electricbill = myConsumption * .5;
        }
              else {
               electricbill=myConsumption*.6;
                System.out.println(electricbill);
             }

            }
        }





