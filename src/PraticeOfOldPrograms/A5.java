package PraticeOfOldPrograms;
//check ele present in array or not
public class A5
{
    public static void main(String[] args) {
        int[] a={36,45,2,34};
        int value=45;
        boolean found=false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==value)
            {
                System.out.println("Found it : " + value);
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Not found");
        }
    }
}
