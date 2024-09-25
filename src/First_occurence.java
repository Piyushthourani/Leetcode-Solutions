
/*
Leetcode question ID:28
 */
import java.util.*;
public class First_occurence {
    public  static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter haystack string and needle string");
        String haystack = scanner.next();
        String needle = scanner.next();
        System.out.println(strStr(haystack, needle));

    }
}
