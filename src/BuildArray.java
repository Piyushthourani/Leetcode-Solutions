/*
Question id: 1920
 */
import java.util.*;
public class BuildArray {
    public static int[] buildArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];

        for(int i=0;i<n;i++)
        {
            res[i]=nums[nums[i]];
        }
        System.gc();
        return res;
    }
    public static void main(String[] args){
        int nums[]={5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
