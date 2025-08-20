package BasicToMid;

public class ArrayOneDime
{
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5};
        System.out.println("Single dimentsional array, printing one element : "+ array1[1]);
        for(int i=0;i<=4;i++)
        {
            int result;
            result=+array1[i];
            System.out.println("Array elements are : "+result);
        }
    }
}
