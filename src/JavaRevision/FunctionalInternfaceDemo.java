package JavaRevision;

@FunctionalInterface //used to show that or using only one method
interface Mother1
{
    void song();
}

class Child1 implements Mother1
{
    public void song()
    {
        System.out.println("Child song");
    }
}

public class FunctionalInternfaceDemo
{
    public static void main(String[] args)
    {
        Mother1 c = new Child1();
        c.song();
    }

}
