package BasicToMid;
public class ExceptionHandling1
{
        public static void main(String[] args) {
            int a=10;
            int b=0;
            try
            {
                int r=a/b;
                System.out.println(r);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Can not devide by zero");
            }
            finally {
                System.out.println("devide by zero error");
            }
        }
    }
