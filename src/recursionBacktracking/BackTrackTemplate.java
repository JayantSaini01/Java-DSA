package recursionBacktracking;

import java.util.ArrayList;
import java.util.List;

public class BackTrackTemplate
{
    public static void backtrack(int[]arr,int n,int index,List<Integer>diary)
    {
        if(index==n)
        {
            System.out.println(diary);
            return;
        }
        backtrack(arr,n,index+1,diary);//exclude

        diary.add(arr[index]);
        backtrack(arr,n,index+1,diary);//include
        diary.remove(diary.size()-1);

    }

        public static void main(String[]args)
    {
        int[]arr={1,2,3};
        int n=arr.length;
        backtrack(arr,n,0,new ArrayList<>());
    }
}




//public class BackTrackTemplate
//{
//    public static void fun(int[]arr, int n, int i, List<Integer>temp)
//    {
//        if(i==n)
//        {
//            System.out.println(temp);
//            return;
//        }
//        fun(arr,n,i+1,temp);
//
//        temp.add(arr[i]);
//        fun(arr,n,i+1,temp);
//        temp.remove(temp.size()-1);
//
//    }
//    public static void main(String[]args)
//    {
//        int[]arr={1,2,3};
//        int n=arr.length;
//        fun(arr,n,0,new ArrayList<>());
//    }
//}