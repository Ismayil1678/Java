package newclass;
public class questionhomework {
    public static void main(String[] args) {
        System.out.println("  1  2  3  4  5  6  7  8  9  10");
        System.out.println("  ______________________________");
        for (int a = 1; a < 11; a++) {
            System.out.println();
            for(int b=1;b<11;b++){
                System.out.format(" %2s" ,a*b);
            }


        }

    }
}



