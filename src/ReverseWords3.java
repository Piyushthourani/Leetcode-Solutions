/*
question ID:557
 */
public class ReverseWords3 {
    public static String reverseWords(String s) {
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            StringBuffer sb=new StringBuffer(str[i]);
            sb.reverse();
            str[i]=sb.toString();
        }
        s="";
        int i;
        for(i=0;i<str.length-1;i++)
        {
            s = s+str[i]+" ";
        }
        return s+str[i];
    }
    public static void main(String[] args)
    {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
