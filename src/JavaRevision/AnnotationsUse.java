package JavaRevision;

class Mother
{
    public void song()
    {
        System.out.println("sing");
    }
}

class Child extends Mother
{
    //@override/* used to overrid method from parent class */
    public void song()
    {
        System.out.println("Child song");
    }
}
public class AnnotationsUse
{
    public static void main(String[] args)
    {
        Child c=new Child();
        System.out.println(c);
    }
}
