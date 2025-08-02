package OOPS;

interface Animal1
{
    void sound();
}

class birds1 implements Animal1{
    @Override
    public void sound() {
        System.out.println("sound printing in birds1");
    }
}
public class InterfaceUse
{
    public static void main(String[] args) {
        //create object for child class only
        birds1 b=new birds1();
        b.sound();
    }
}
