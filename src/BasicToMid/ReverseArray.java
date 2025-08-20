package BasicToMid;

public class ReverseArray
{
    public static void main(String[] args) {
        int[] array={13,23,12,87,45};
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Original elements : " + array[i]);
        }

        for(int i=array.length-1;i>=0;i--)
        {
            System.out.println(array[i]+" ");
        }
    }
}
