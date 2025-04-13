package JavaRevision;

abstract class Animal{
    abstract void sound();
    void sound2(){
        System.out.println("Dancing");
    }
}
class Dog extends Animal{
   void sound()
   {
       System.out.println("JavaRevision.Dog sound: Bark");
   }
}

public class AbstractClass
{
    public static void main(String args[])
    {
        Animal a=new Dog();
        a.sound();
        a.sound2();
    }
}
