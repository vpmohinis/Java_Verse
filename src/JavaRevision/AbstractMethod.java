package JavaRevision;

//if you do not know what to put in body of method so
//you can make it abstract where you can define the method body in other class using extend keyword.


abstract class Abstract
{
     public abstract void abstract1();
}

class normal extends Abstract
{
    public void abstract1()
    {
        System.out.println("Abstract Method");
    }
}
public class AbstractMethod
{
    public static void main(String[] args)
    {
        normal n=new normal();
        n.abstract1();
    }
}
