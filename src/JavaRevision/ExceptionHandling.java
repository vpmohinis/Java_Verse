package JavaRevision;

public class ExceptionHandling
{
    public static void main(String[] args) {
        int i = 10;
        try {
            int result = i / 0;
        } catch (Exception e) {
            System.out.println("Can not divide by zero");
        }
    }
}
