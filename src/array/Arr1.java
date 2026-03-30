package array;

import java.util.Arrays;

public class Arr1
{
    static void change(int[]arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]+1;
        }

    }

    static void main(String[] args)
    {

        int[]arr={97,98,99};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}