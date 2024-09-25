/*
Leetcode Question Id: 13
 */

import java.util.Scanner;
public class Roman_to_Integer {
    public static int romanToInt(String s) {
        int sum=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char x=s.charAt(i);
            switch(x)
            {
                case 'I':
                    sum+= 1*((sum>=5)?-1:1);
                    break;
                case 'V':
                    sum+= 5;
                    break;
                case 'X':
                    sum+= 10*((sum>=50)?-1:1);
                    break;
                case 'L':
                    sum+= 50;
                    break;
                case 'C':
                    sum+= 100*((sum>=500)?-1:1);
                    break;
                case 'D':
                    sum+= 500;
                    break;
                case 'M':
                    sum+= 1000;
                    break;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a Roman number string");
        String s=scanner.next();
        System.out.println(romanToInt(s));
    }
}
