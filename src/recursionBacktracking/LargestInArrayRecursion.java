package recursionBacktracking;

public class LargestInArrayRecursion
{
    static int fun(int[]arr,int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        int last=arr[n-1];
        int ans=fun(arr,n-1);
        return Math.max(last,ans);

    }
    public static void main(String[]args)
    {
        int[]arr={5,13,8};
        int n=arr.length;
        System.out.println(fun(arr,n));
    }
}
