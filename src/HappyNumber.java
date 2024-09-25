/*
Leetcode Question ID:202
 */
import java.util.*;
public class HappyNumber {
    public static boolean isHappy(int n) {
        if(n<=6)
        {
            if(n==1)
                return true;
            else
                return false;
        }
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return isHappy(sum);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        System.out.println(isHappy(n));

    }
}
