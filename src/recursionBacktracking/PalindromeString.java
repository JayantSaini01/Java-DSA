package recursionBacktracking;

public class PalindromeString
{
    public static boolean isPalindrome(String s,int low,int high)
    {
        int length=high-low+1;
        if(length==0||length==1)
        {
            return true;
        }
        if(s.charAt(low)!=s.charAt(high))
        {
            return false;
        }
        return isPalindrome(s,low+1,high-1);
    }
    public static void main(String[] args)
    {
        String s="noan";
        int low=0;
        int high=s.length()-1;
        System.out.println(isPalindrome(s,low,high));
    }
}
