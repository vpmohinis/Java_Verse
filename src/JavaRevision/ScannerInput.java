package JavaRevision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerInput
{
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n: ");
        int n=sc.nextInt();
        System.out.println("Value entered by you: "+n);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value for m: ");
        int m = Integer.parseInt(br.readLine());
        System.out.println("Value entered by you: "+m); // reads whole line

    }
}
