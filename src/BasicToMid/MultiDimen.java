package BasicToMid;

public class MultiDimen
{
    public static void main(String[] args) {
        int[][] array2 ={{1,2,3},{1,2,3}};

        //with print only
        for(int i=0;i<array2.length;i++)
        {
            for(int j=0;j<array2[i].length;j++)
            {
                System.out.print(array2[i][j]);
            }
        }

        //with println
        for(int i=0;i<array2.length;i++)
        {
            for(int j=0;j<array2[i].length;j++)
            {
                System.out.println(array2[i][j]);
            }
        }
    }
}
