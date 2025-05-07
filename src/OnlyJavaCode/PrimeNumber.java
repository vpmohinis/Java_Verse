package OnlyJavaCode;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter value for number: ");
        int number=sc.nextInt();
        System.out.println("You enter this value for number: "+" "+number);
        int divisor = 0; //to store value after division
        
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                divisor++;
            }
        }
        if(divisor<=2)
        {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
