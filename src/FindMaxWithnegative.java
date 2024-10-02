/*
Question id: 2441
 */
import java.util.*;
public class FindMaxWithnegative {
    public static int findMaxK(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            hs.add(nums[i]);
        Arrays.sort(nums);
        int i=nums.length-1;
        while(i>=0)
        {
            if(hs.contains(-nums[i]))
                break;
            i--;
        }
        if(i==-1)
            return -1;
        else
            return nums[i];

    }
    public static void main(String[] args){
        int nums[]={-1,10,6,7,-7,1};
        System.out.println(findMaxK(nums));
    }
}
