/*
Leetcode Question ID: 41
Difficulty: Hard
 */
import java.util.*;
public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int t=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0 && nums[i]==t)
                t++;
        }
        return t;

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=scanner.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        System.out.println(firstMissingPositive(nums));
    }
}
