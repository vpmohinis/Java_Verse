public class ifelse
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        int c=30;
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }

        if(a>b && a>c)
        {
            System.out.println("a is bigger");
        }
        else if (b>a && b>c)
        {
            System.out.println("b is bigger than");
        }
        else{
            System.out.println("c is greater than a and b");
        }
    }
}
