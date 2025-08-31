package PraticeOfOldPrograms;
//find min in array
public class A4
{
    public static void main(String[] args) {
        int[] a={5,2,3};
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
