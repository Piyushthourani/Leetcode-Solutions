/*
Question ID: 921
Difficulty: Medium
 */
public class MinAddToMakeValid {
    public static int minAddToMakeValid(String s) {
    int count=0,count1=0;
        for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='(')
            count++;
        else
        {
            if(count>0)
                count--;
            else
                count1++;
        }
    }
        return count+count1;
}
public static void main(String[] args)
{
    System.out.println(minAddToMakeValid("))((())("));
}
}
