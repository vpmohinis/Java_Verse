package OOPS;

class Father
{
    public void parents(String name)
    {
        System.out.println("Father class Method : "+name);
    }
}

class Mother extends Father
{
    public void parents(String name, String age)
    {
        System.out.println("Mother class Method : "+name+age);
    }
}
public class RunTimePolyMorphi
{
    public static void main(String[] args) {
        Mother m=new Mother();
        m.parents("Mohini");
        m.parents("Mohini "+" 12");
    }
}
