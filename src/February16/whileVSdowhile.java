package February16;

public class whileVSdowhile {
    public static void main(String[] args) {
        int number=1;
        char letter='a';
        while(number<5){
            int count=0;
            System.out.print(number);
            while(count<6) {
                System.out.print(letter);
                letter++;
                count++;

            }
            System.out.println();
            number++;

        }
    }
}
