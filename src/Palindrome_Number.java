/*
Leetcode Question ID: 9
 */

import java.util.Scanner;
public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        int i=x;
        int sum=0;
        while(i>0)
        {
            sum =sum*10+(i%10);
            i=i/10;
        }
        if(sum==x)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x=scanner.nextInt();
        System.out.println(isPalindrome(x));

    }
}
