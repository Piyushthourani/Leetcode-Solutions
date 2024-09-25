/*
Leetcode question ID: 66
 */
import java.util.*;
public class Plus_one {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=scanner.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elements");
        for (int i=0; i<n; i++)
        {
            nums[i]=scanner.nextInt();
        }
        int result[]=plusOne(nums);
        System.out.println(Arrays.toString(result));
    }
}
