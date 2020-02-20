package udemy;

public class whileandfor {
    public static void main(String[] args) {
        /*for (int i = 1; i < 4; i++) {
            for (int j =1; j < 6; j++) {
                System.out.print(j + "\t");
            }

                    System.out.println();




            }*/
        int x=3;
          for(int i = 1; i<=3;i++ ){
            for(int j = 1; j<=4;j++){
                System.out.print("\t"+x);
                x=x+2;
            }
            System.out.println();
        }
    }

}