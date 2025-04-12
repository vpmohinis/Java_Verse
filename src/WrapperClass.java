//used to convert primtive int to Interger and vise versa
//wrapper classes are used to convert premitive data types to objet types

public class WrapperClass
{
    public static void main(String[] args)
    {
        int n=10;
        Integer N=Integer.valueOf(n);
        System.out.println("Wrapper Int: "+N);
    }
}
