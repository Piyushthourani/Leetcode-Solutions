/*
Leetcode Question ID: 7
Difficulty: Medium
 */

public class ReverseInteger {
    public static int reverse(int x) {
        long res=0;
        int i=x;
        while(i!=0)
        {
            int rem=i%10;
            res = res*10+rem;
            i=i/10;
        }
        if(res>(Math.pow(2,31)-1) || res<Math.pow(-2,31))
            return 0;
        else
            return (int)res;
    }
    public static void main(String[] args){
        System.out.println(reverse(-4683));
        System.out.println(reverse(34843));
        System.out.println(reverse(1327326339));
    }
}
