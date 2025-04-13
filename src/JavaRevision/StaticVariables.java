package JavaRevision;

class Data{
    static int age;
    static String name;
}
public class StaticVariables
{
    public static void main(String[] args)
    {
        Data.age=12;
        Data.name="Mohini";
        System.out.println("My age: "+Data.age);
        System.out.println("My name is: "+Data.name);
    }
}
