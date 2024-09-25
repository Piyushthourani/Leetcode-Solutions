/*
Leetcode Question id: 217
 */
import java.util.*;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
                return true;
            hs.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            nums[i] = scanner.nextInt();
        }
        System.out.println(containsDuplicate(nums));
    }
}
