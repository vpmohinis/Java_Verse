package OnlyJavaCode;

import java.util.Scanner;

public class FibbonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many terms you want to add in series");
        int n=sc.nextInt();
        System.out.println("Enter first term: ");
        int n1=sc.nextInt();
        System.out.println("Enter second term: ");
        int n2=sc.nextInt();

        for(int i=2;i<n;i++)
        {
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println("Fibbonacci series: "+n3);
        }
    }
}
