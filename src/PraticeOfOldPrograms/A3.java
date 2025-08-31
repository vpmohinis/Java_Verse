package PraticeOfOldPrograms;
//check max in array
public class A3
{
    public static void main(String[] args) {
        int[] a={1,4,3};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
