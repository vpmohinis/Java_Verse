package PraticeOfOldPrograms;
//array reverse all elements
public class A6 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.printf("Reversed array : ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
