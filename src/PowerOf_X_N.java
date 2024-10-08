/*
Question ID: 50
Difficulty: Medium
 */
public class PowerOf_X_N {
    public static double myPow(double x, int n) {
        if(n<0)
        {
            n=-n;
            x=1/x;
        }
        double ans=1;
        while(n!=0)
        {
            if((n&1)!=0)
                ans=ans*x;
            x=x*x;
            n= n>>>1;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(myPow(2.1000,3));
        System.out.println(myPow(2.0000,-2));
    }
}
