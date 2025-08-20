package BasicToMid;

public class FindElemLinearSearch
{
    public static void main(String[] args) {
        int[] array={23,4,35,67,598,98};
        int value=59;
        boolean found=false;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==value)
            {
                System.out.println("Found the value");
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
