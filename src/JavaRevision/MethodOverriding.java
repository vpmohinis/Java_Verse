package JavaRevision;

class C
{
    void method1()
    {
        System.out.println("Parent class");
    }
}

class D extends C
{
    void method1()
    {
        super.method1();
        System.out.println("Child class");
    }
}

public class MethodOverriding
{
    public static void main(String[] args)
{
   D d=new D();
   d.method1();
}
}
