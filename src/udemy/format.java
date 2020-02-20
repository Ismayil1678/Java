package udemy;

public class format {
    public static void main(String[] args) {
        for( int i=10;i<30;i++){
            System.out.format("%4s /t",i);

            System.out.println();
            for(int j=10;j<30;j++){
                System.out.format("%4s /t",j);
            }
        }
    }
}
