package OnlyJavaCode;

import java.util.Scanner;

public class SwapTwoNumbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Value of a before swapping: "+a);
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Value of b before swapping: "+b);

        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("Value of a after swapping: "+a);
        System.out.println("Value of b after swapping: "+b);
    }
}
