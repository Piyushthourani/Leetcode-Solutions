/*
Leetcode Question Id:75
 */
import java.util.*;
public class SortColors {
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array size");
        int n=scanner.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            nums[i] = scanner.nextInt();
        }
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
