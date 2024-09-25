/*
Leetcode Question ID: 136
 */
import java.util.*;
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int temp=0;
        for (int num : nums) {
            temp = temp ^ num;
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=scanner.nextInt();
        System.out.println("Enter array elements");
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        System.out.println(singleNumber(nums));
    }
}
