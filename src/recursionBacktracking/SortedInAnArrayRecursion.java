package recursionBacktracking;

public class SortedInAnArrayRecursion
{

    public static boolean sorted(int[]arr,int n,int index)
    {
        if(index==n||n==0)
        {
            return true;
        }

        if(arr[index]>arr[index+1])
        {
            return false;
        }
        return sorted(arr,n,index+1);
    }
    public static void main(String[] args)
    {
        int[]arr={10,20,30,40,50};
        int n=arr.length-1;
        int index=0;
        System.out.println(sorted(arr,n,index));
    }
}
