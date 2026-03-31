package recursionBacktracking;

public class SumOfDigits
{
    public static int digitSum(int num)
    {
        //Base case
        if(num==0)
        {
            return 0;
        }

        //Ek chota part alag karo
        int lastDigit=num%10;

        //Bacha hua problem define karo
        num=num/10;

        //Recursion pe trust karo
        int ans=digitSum(num);

        //Combine ans with chota part
        return lastDigit+ans;
    }

    public static void main(String[] args)
    {
        int num=567;
        System.out.println(digitSum(num));

    }
}
