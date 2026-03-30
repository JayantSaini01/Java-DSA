package recursionBacktracking;

public class Basic
{

    public static int fun(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int ans=fun(n-1);
        return ans+n;
    }
    public static void main(String[]args)
    {
        int n=4;
        System.out.println(fun(n));
    }
}
