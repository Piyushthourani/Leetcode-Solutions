/*
Question ID:326
 */
public class PowerofThree {
    public static boolean isPowerOfThree(int n) {
        if(n<0)
        {
            return false;
        }
        for(int i=0;i<=20;i++)
        {
            if(Math.pow(3,i)==n)
                return true;
            else if(Math.pow(3,i)>n)
                return false;
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(isPowerOfThree(27));
    }
}
