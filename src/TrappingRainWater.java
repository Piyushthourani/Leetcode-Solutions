/*
Leetcode Question ID: 42
Difficulty: Hard
 */
public class TrappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        leftmax[0] = height[0];
        for (int i = 1; i < n; i++)
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);

        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--)
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);

        int trap = 0;
        for (int i = 0; i < n; i++)
            trap += Math.min(leftmax[i], rightmax[i]) - height[i];

        return trap;
    }
    public static void main(String[] args)
    {
       int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.println(trap(height));

    }
}
