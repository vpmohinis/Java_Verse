package JavaRevision;

//it is used to explain multiple inheritance in java.
//it has abstract methods only that means without body
//class name starts with keyword interface
//concret class will implement the interface
interface Animal1
{
    void sound();
}
class Dog1 implements Animal1 {
    public void sound()
    {
        System.out.println("Bark");
    }
}
public class Interface1
{
    public static void main(String args[])
    {
        Animal1 a= new Dog1();
        a.sound();
    }
}
