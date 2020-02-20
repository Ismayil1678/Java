package febrary16;

public class lowercasestring {
    public static void main(String[] args) {
        String sentence="enter you number";
        char letter;
        for( int i=0;i<sentence.length();i++){
            if((sentence.charAt(i)<=122 && sentence.charAt(i)>=97)||sentence.charAt(i)==' '){
                System.out.print(sentence.charAt(i));
            }

        }
    }
}
