package JavaRevision;

enum Status   //class
{
    Running, Pending, Done; //objects of Status
}
public class EnumConstantsUse
{
    public static void main(String[] args)
    {
        Status s1=Status.Running; // no need of new as objects are already created
        System.out.println("Status 1: "+s1);
        Status s2=Status.Pending;
        System.out.println("Status 2: "+s2);
        Status s3=Status.Done;
        System.out.println("Status 3: "+s3);
    }
}
