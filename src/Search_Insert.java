/*
Leetcode Question ID: 35
 */
import java.util.*;
public class Search_Insert {
    public static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(target>nums[n-1])
        {
            return n;
        }
        else if(target<nums[0])
        {
            return 0;
        }
        else
        {
            int i=0;
            while(i<n)
            {
                if(target<=nums[i])
                    break;
                i++;
            }
            return i;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter target value");
        int target=scanner.nextInt();
        System.out.println(searchInsert(nums,target));
    }
}
