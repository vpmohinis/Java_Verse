package JavaRevision;

public class Constructors
{
    int age;
    String name;
    public  Constructors()
    {
        this.age=age;
        this.name=name;
    }
    public  Constructors(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public static void  main(String[] args)
    {
        Constructors c1=new Constructors();
        c1.age=21;
        c1.name="Mohini";
        System.out.println(c1.age+c1.name);
        Constructors c2=new Constructors(90,"mojiki");
        System.out.println(c2.age+c2.name);
    }
}
