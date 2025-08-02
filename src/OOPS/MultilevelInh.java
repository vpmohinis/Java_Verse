package OOPS;

class A1
{
    public void a()
    {
        System.out.println("from A1");
}
}

class B1 extends A1
{
    public void B1()
    {
        System.out.println("from B");
    }
}

class C1 extends B1{
    public void C()
    {
        System.out.println("from C");
    }
}
public class MultilevelInh
{
    public static void main(String[] args) {
       C1 c=new C1();
       c.a();
       c.B1();
       c.C();
    }
}
