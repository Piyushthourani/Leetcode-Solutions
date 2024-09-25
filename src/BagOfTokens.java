/*
Id:948
difficulty: Medium
 */
import java.util.*;
public class BagOfTokens {
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int s = 0;
        int maxi = 0;
        int l = 0, r = tokens.length - 1;

        while (l <= r) {
            if (power >= tokens[l]) {
                power -= tokens[l];
                s++;
                l++;
                maxi = Math.max(maxi, s);
            } else if (s > 0) {
                power += tokens[r];
                s--;
                r--;
            } else {
                break;
            }
        }

        return maxi;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter token array size");
        int n=scanner.nextInt();
        int tokens[]=new int[n];
        System.out.println("Enter array elements");
        for (int i=0; i<n; i++)
        {
            tokens[i]=scanner.nextInt();
        }
        System.out.println("Enter power");
        int power=scanner.nextInt();
        System.out.println(bagOfTokensScore(tokens, power));
    }
}
