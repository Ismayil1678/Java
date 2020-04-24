package February16;
public class hexnumber {
    public static void main(String args[]){
        String myStr="12545ADX1253";
        boolean hex=false;
        for(int i=0;i<12;i++) {
            if (myStr.charAt(i) == 'A' || myStr.charAt(i) == 'X') {
                hex = true;
            }
        }
         if(hex){
               System.out.println("yes: hex number");
           } else{
               System.out.println("Not hex");
           }
         }
}