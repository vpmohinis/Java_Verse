//method overloading or compile time polymorphism which can have same name with diff para list
class Cal{
    public int Add(int n1, int n2)
    {
        return n1+n2;
    }
    public int Add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
}


public class MethodOverloading
{
    public static void main(String[] args)
    {
        Cal cal=new Cal();
        int r1=cal.Add(2,3);
        System.out.println(r1);
        int r2=cal.Add(2,3,4);
        System.out.println(r2);
    }
}
