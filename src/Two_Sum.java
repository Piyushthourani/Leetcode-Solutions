/*
Leetcode Question ID=1
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Two_Sum {
        public static int[] twoSum(int[] nums, int target) {
            int n=nums.length;
            Map <Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                int key=target-nums[i];
                if(map.containsKey(key))
                {
                    return new int[]{i,map.get(key)};
                }
                map.put(nums[i],i);
            }
            return new int[]{};
        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter size of array more than 2 and less than 10^4");
            int n=scanner.nextInt();
            int nums[] = new int[n];
            System.out.println("Enter array elements");
            for(int i=0;i<n;i++)
            {
                nums[i] = scanner.nextInt();
            }
            System.out.println("Enter target sum value");
            int target=scanner.nextInt();
            int result[]=twoSum(nums,target);
            System.out.println(Arrays.toString(result));

    }
}
