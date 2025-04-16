package JavaRevision;
class A2
{
    void showdata()
    {
        System.out.println("Parent class");
    }
}
class B extends A2{
    void showdata()
    {
        super.showdata();
        System.out.println("Child class");
    }
}
public class SuperKeywordUse
{
    public static void main(String[] args)
    {
        B b=new B();
        b.showdata();
    }
}
