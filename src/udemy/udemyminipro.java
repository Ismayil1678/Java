package udemy;

import java.util.Scanner;

public class udemyminipro {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("viza1");
        int viza1=scanner.nextInt();
        System.out.println("viza2");
        int viza2=scanner.nextInt();
        System.out.println("total");
        double nettotal=scanner.nextInt();
        System.out.println("only total");
         int tolal=scanner.nextInt();
         double total =(viza1 * 3/10.0)+ (viza2 * 3/10.0) ;
         if(total>=90) {
             System.out.println("AA");
         }
         else if(total>=85) {
             System.out.println("BA");
         }
         if(nettotal<2.40){
             System.out.println("only total");

         }
         else if(total>=80) {
             System.out.println("BB");
         }
         else if(total>=75) {
             System.out.println("BC");
         }
         else if(total>70) {
             System.out.println("CC");
         }
         else if(total>65) {
             System.out.println("CD");
         }
         else{
             System.out.println("net total " );

        }


        }

    }

