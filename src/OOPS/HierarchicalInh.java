package OOPS;

class A
{

}
class B extends A{

}
class C extends B{

}
class D extends A{

}
class F extends D
{

}
public class HierarchicalInh
{
    public static void main(String[] args) {
        D d=new D();
        C c=new C();
    }
}
