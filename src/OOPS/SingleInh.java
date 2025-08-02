package OOPS;

class boy
{
    public void display()
    {
        System.out.println("Boy");
    }
}

class child extends boy{
    public void display()
    {
        super.display();//to print method from parent class
        System.out.println("child");
    }
}

public class SingleInh
{
    public static void main(String[] args) {
        child c=new child();
        c.display();
    }
}
