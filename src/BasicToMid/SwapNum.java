package BasicToMid;
//swap two numbers

import java.util.Scanner;

public class SwapNum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m : ");
        int m=sc.nextInt();
        System.out.println("Enter n : ");
        int n=sc.nextInt();

        int temp=m;
        m=n;
        n=temp;

        System.out.println(m);
        System.out.println(n);
    }
}
