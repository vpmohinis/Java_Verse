package OOPS;

class Mom
{
    public String mother(int a)
    {
        return("Mom calling"+a);//return type is string so need to define method as a string
    }

}
public class SaticPolyMorph
{
    public static void main(String[] args) {
        Mom m=new Mom();
        System.out.println(m.mother(10));
    }
}
