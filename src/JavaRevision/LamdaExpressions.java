package JavaRevision;
@FunctionalInterface
interface one
{
    int name(int i, int j);
}

public class LamdaExpressions
{
    public static void main(String[] args)
    {
        one o=( i, j)-> i+j;
        int result=o.name(1,2);
        System.out.println(result);
    }
}
