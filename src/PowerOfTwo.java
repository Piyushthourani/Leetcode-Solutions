/*
Leetcode Question ID: 231
 */
import java.util.*;
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        else
            return ((n&(n-1))==0);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= scanner.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
