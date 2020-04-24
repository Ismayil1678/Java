package February19;
public class printwhilee {
    public static void main(String[] args) {
        int i = 0;
        int j ;
        while (i < 15) {
            j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;

        }
    }

}

