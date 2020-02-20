package febrary16;

public class vowelsonly {
    public static void main(String[] args) {
        String mystr = "java is fun";
        for (int index=0;index<mystr.length();index++){
            if(mystr.charAt(index)=='a'|| mystr.charAt(index)=='i'|| mystr.charAt(index)=='u'){
                System.out.println(mystr.charAt(index));
            }
            }
        }
    }