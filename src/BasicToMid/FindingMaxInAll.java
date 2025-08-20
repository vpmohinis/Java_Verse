package BasicToMid;

public class FindingMaxInAll
{
    public static void main(String[] args) {
        int[] array={23,42,57,89};
        int max=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
