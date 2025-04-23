package JavaRevision;
interface Mohini
{
    void s();
    void g();
}

class d implements Mohini
{

   public void s()
   {
       System.out.println("S method");
   }
   public void g()
   {
       System.out.println("g method");
   }
}
public class InterfaceImp
{
    public static void main(String[] args)
    {
        Mohini obj=new d();
        obj.s();
        obj.g();

    }
}
