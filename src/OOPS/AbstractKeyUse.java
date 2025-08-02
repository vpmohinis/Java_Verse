package OOPS;

abstract class Animal
{
    //with abstract key means without method body
    abstract void sound();
    abstract void age();

    //without abstract method with method body
    void demo()
    {
        System.out.println("Demo");
    }
}

class birds extends Animal{
    // we can use override too but it is working without it as it have extend and inheritance too
     void sound()
    {
        System.out.println("printing Sound");
    }
    void age()
    {
        System.out.println("printing Age");
    }
}
public class AbstractKeyUse
{
    public static void main(String[] args) {
        Animal a=new birds();
        a.sound();
        a.age();
    }
}
