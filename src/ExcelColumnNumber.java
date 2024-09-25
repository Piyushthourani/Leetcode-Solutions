/*
Leetcode Question ID: 171
 */
import java.util.*;
public class ExcelColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int sum=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            sum = sum*26 + columnTitle.charAt(i)-64;
        }
        return sum;
    }
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any excel column string");
        String s=scanner.next();
        System.out.println(titleToNumber(s));
    }
}
