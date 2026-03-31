package recursionBacktracking;

public class RemoveCharFromString
{
    public static String fun(String str,int n,int i,char ch)
    {
        if(i==n)
        {
            return "";
        }
        String ans=fun(str,n,i+1,ch);
        if(str.charAt(i)==ch)
        {
            return ans;
        }
        return str.charAt(i)+ans;
    }
    public static void main(String[] args)
    {
        String str="abacadae";
        int n=str.length();
        int i=0;
        char ch='a';
        System.out.println(fun(str,n,i,ch));

    }
}
