package JavaRevision;

class Student
{
    String name;
    int rollno;
}

public class ArrayOfObjects
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.name="Mohini";
        s1.rollno=101;

        Student s2=new Student();
        s2.name="Darshan";
        s2.rollno=102;

        Student student[]=new Student[2];
        student[0]=s1;
        student[1]=s2;
//used normal for loop
        for(int i=0;i<student.length;i++)
        {
            System.out.println("Name:"+student[i].name+"Roll Number:"+student[i].rollno);
        }
//FOR EACH LOOP for ARRAY OF OBJECTS WHERE NO NEED TO USE OTHER FOR LOOP FEATURES
        for(Student n:student)
        {
            System.out.println(n.name+" "+n.rollno);
        }
    }
}
