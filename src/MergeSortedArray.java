/*
Leetcode question id: 88
 */
import java.util.*;
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;j<n;j++)
        {
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of m");
        int m = scanner.nextInt();
        System.out.println("enter value of n");
        int n=scanner.nextInt();
        int nums1[]=new int[m+n];
        int nums2[]=new int[n];
        System.out.println("enter 1st array elements");
        for(int i=0;i<m;i++)
        {
            nums1[i]=scanner.nextInt();
        }
        System.out.println("Enter 2nd array elements");
        for (int i=0;i<n;i++)
        {
            nums2[i]=scanner.nextInt();
        }
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
