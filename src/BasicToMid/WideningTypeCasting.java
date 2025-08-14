package BasicToMid;

public class WideningTypeCasting
{
    public static void main(String[] args) {
        //widening typecasting
        int a=10;
        float f;
        f=(float)a;
        System.out.println("Float converted value from int : " + f);

        //narrowing type casting
        float m=10;
        int s;
        s=(int)m;
        System.out.println("Original value of float : "+m);
        System.out.println("Value after narrowing type casting : "+s);

    }
}
