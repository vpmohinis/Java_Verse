package JavaRevision;

class Demo{
    static int age;
    static String name;

    public static void show()
    {
        System.out.println("This is the Static method");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class StaticMethod
{
    public static void main(String[] args)
    {
        Demo.name="Mohini";
        Demo.age=12;
        Demo.show();
    }
}
