/*
ID:442
Difficulty : Medium
 */
import java.util.*;
public class AllDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List <Integer> li=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                li.add(nums[i]);
        }
        return li;
    }
    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter array size");
            int n=scanner.nextInt();
            int nums[]=new int[n];
            System.out.println("Enter array elements");
            for (int i=0; i<n; i++)
            {
                nums[i]=scanner.nextInt();
            }
            System.out.println(findDuplicates(nums));
    }
}
