package JavaRevision;

public class SingleDoubleArray
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[][] matrix = {{1, 4, 2}, {3, 6, 8}};
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(matrix[i][j]);
            }
        }
        for(i=0;i<4;i++)
        {
                System.out.println("JavaRevision.first array:"+arr[i]);
        }
    }
}
