package OOPS;

class Mom
{
    public String mother(int a)
    {
        return("Mom calling"+a);//return type is string so need to define method as a string
    }
}
class Dad
{
    public String mother(int a, int b)
    {
        return("Dad calling : "+(a+b));
    }
}
public class SaticPolyMorph
{
    public static void main(String[] args) {
        Mom m=new Mom();
        System.out.println(m.mother(10));
        Dad d=new Dad();
        System.out.println(d.mother(10,11));
    }
}
