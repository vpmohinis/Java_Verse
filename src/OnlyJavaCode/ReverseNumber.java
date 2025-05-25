package OnlyJavaCode;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n: ");
        int number=sc.nextInt();
        int rem=0;
        int sum=0;

        while(number>0)
        {
            rem=number%10+rem*10;
            number=number/10;
        }

        System.out.println("Reverse number: "+number);
    }
}
