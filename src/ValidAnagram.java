/*
Question ID: 242
 */
import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char as[]=s.toCharArray();
        char at[]=t.toCharArray();
        Arrays.sort(as);
        Arrays.sort(at);

        if(as.length==at.length)
        {
            if(Arrays.equals(as,at))
                return true;
            else
                return false;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        String s="anagram";
        String t="nagraam";
        System.out.println(isAnagram(s,t));
    }
}
