package BasicToMid;
public class AddBrinaryStrings {
    public static void main(String[] args) {
        String s1="0110";
        String s2="1101";
        int n1=Integer.parseInt(s1,2);
        int n2=Integer.parseInt(s2,2);
        int n3=n1+n2;
        System.out.println(n3); //addition
        System.out.println("Binary sum : " + Integer.toBinaryString(n3));
    }
}
