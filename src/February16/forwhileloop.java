package February16;

public class forwhileloop {
    public static void main(String[] args) {
        char letter='a';
        for(int i=1;i<5;i++){
            System.out.print(i+"\t");
            letter++;
            for(int j=1;j<5;j++){
                System.out.print(letter+"\t");
               // letter++;
            }
            System.out.println();
           //letter++;
        }
    }
}
