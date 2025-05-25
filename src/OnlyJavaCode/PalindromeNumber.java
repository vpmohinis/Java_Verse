package OnlyJavaCode;

import java.util.Scanner;

//the number in reverse will be same like the original one
//eg 121
//reminder, sum, modulus-> all in while loop to check with each digit
public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        int sum=0;
        int reminder=0;

        int temp=number;

        while(number>0)
        {
            reminder=number%10;
            sum=(sum*10)+reminder;
            number=number/10;
        }

        if(temp==sum)
        {
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not palindrome");
        }

    }
}
