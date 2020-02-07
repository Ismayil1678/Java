package firstpackage;

import java.util.Scanner;
public class implement {
    public static void main( String [] args){
        Scanner myScanner=new Scanner( System.in);
        System.out.println("Please enter a year");
         int year=myScanner.nextInt();

        if( year>2019)

    {
        System.out.println(" After milenium");

    }else{
        System.out.println("before milenium");
    }
}
}