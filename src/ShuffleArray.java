/*
Question ID:1470
 */
import java.util.*;
public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int c=0;
        int []num=new int[nums.length];
        for(int i=1;i<=n;i++)
        {
            num[c++]=nums[i-1];
            num[c++]=nums[i+n-1];
        }
        return num;
    }
    public static void main(String[] args){
        int nums[]= {2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}
