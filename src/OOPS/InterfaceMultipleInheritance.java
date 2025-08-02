package OOPS;

interface Cat
{
    void sound1();
}

interface Dog
{
    void sound();
}

class fish implements Cat,Dog{
    public void sound1() {
        System.out.println("Printing from cat");
    }
    public void sound()
    {
        System.out.println("From fish");
    }
}

// we can use the same sound method in both class but can not implement in same class in child class
//to avoid need to create object for child class

public class InterfaceMultipleInheritance
{
    public static void main(String[] args) {
        fish f=new fish();
        f.sound();
        f.sound1();
    }
}
