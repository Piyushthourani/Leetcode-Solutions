/*
Leetcode Question ID: 26
 */
import  java.util.*;
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]!=nums[i])
            {
                nums[c++]=nums[i];
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=scanner.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        System.out.println(removeDuplicates(nums));
    }
}
