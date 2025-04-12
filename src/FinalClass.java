final class Animal2{
    void display()
    {
        System.out.println("final class that can be used to prevent from inheritance for security");
    }
}

public class FinalClass
{
    public static void main(String args[])
    {
        Animal2 a=new Animal2();
        a.display();
    }
}
