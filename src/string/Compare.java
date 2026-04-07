package string;

public class Compare
{
    static void main(String[] args) {
        String s1="jay";
        String s2="jay";
        String s3=new String("jay");
        if(s1==s2)
        {
            System.out.println("equal");
        }
        else System.out.println("not equal");

        if(s1.equals(s3))
        {
            System.out.println("equal");
        }
        else System.out.println("not equal");
    }
}
