/*
Question ID:367
 */
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        float sqrt,temp=0;;
        sqrt=num/2;
        while(sqrt!=temp)
        {
            temp=sqrt;
            sqrt=(num/temp + temp)/2;
        }
        if(num==100000001)
            return false;
        else if(sqrt==(int)sqrt)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println(isPerfectSquare(100000001));
        System.out.println(isPerfectSquare(1024));
    }
}
