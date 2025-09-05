package BasicToMid;
import java.util.Scanner;

public class MultiTwoFloats
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first float number : ");
        float f1=sc.nextFloat();
        System.out.println("Enter second float number : ");
        float f2=sc.nextFloat();
        float f3=f1*f2;
        System.out.println("Here is the multiplication : ");
        System.out.println(f3);
    }
}
