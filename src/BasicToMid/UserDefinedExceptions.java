package BasicToMid;

class Myexception extends Exception
{
    public Myexception(String message)
    {
        super(message);
    }
}
public class UserDefinedExceptions
{
    public static void main(String[] args) {
        try{
            throw new Myexception("This is new one");
        }
        catch (Myexception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
