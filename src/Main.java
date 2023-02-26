

public class Main{
    public static void main(String[] args)
    {
        Student s1=new Student("james","gosling","0987654");
        Student s2=new Student("dennis","Ritchie","1234567");
        s1.setGrade(18);
        s2.setGrade(17.5);
        s1.PrintStudentInfo();
        s2.PrintStudentInfo();
    }

}