package JavaRevision;

class Demo1{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationPrivateUse
{
    public static void main(String[] args)
    {
        Demo1 d=new Demo1();
        d.setAge(24);
        d.setName("Mohini");
        System.out.println("Name: "+d.getName());
        System.out.println("Age: "+d.getAge());
    }
}
