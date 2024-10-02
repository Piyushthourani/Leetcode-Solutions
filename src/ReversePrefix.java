/*
question id: 2000
 */
public class ReversePrefix {
    public static String reversePrefix(String word, char ch) {
        int i=0;
        while(i<word.length())
        {
            if(word.charAt(i)==ch)
                break;
            i++;
        }
        if(i==word.length())
            return word;
        StringBuilder sb=new StringBuilder(word.substring(0,i+1));
        sb.reverse();
        word=sb.toString()+word.substring(i+1);
        return word;

    }
    public static void main(String[] args){
        String word="abcdefd";
        char ch='d';
        System.out.println(reversePrefix(word, ch));
    }
}
