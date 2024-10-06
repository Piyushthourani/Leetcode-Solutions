/*
Question Id: 191
 */
public class NumberOF1Bits {
    public static int hammingWeight(int n) {
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)
                count++;
            n= n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(hammingWeight(69));
    }
}
