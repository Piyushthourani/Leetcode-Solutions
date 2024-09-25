/*
Id: 287
difficulty: medium
 */
import java.util.*;
public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=scanner.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elements");
        for (int i=0; i<n; i++)
        {
            nums[i]=scanner.nextInt();
        }
        System.out.println(findDuplicate(nums));
    }
}
