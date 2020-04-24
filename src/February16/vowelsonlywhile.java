package February16;

public class vowelsonlywhile {
    public static void main(String[] args) {
        String sentence="Sunday is fun day";
        int index=0;
        while(index<sentence.length()) {
            if (!(sentence.charAt(index) == 'a' || sentence.charAt(index) == 'i' || sentence.charAt(index) == 'u'))
                System.out.println(sentence.charAt(index));
            index++;

        }
    }

}