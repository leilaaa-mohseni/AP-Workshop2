import java.util.Scanner;

public class lab {
    //fields
    private Student[] student;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;
    //constructor
    public lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        student = new Student[maxSize];
    }

    public void printLabInfo() {
        System.out.println("\nname of teacher:" + teacherName + "\nday of week:" + dayOfWeek + "\nmaxsize:" + maxSize);
    }
    // for calcute grade of students
    public void calAve()
{
    double sum=0;
    // define information of 5 students
    Student  stu1=new Student("leial","mohseni","40131044");
    stu1.setGrade(18.5);
    Student  stu2=new Student("zahra","dehgjhan","40131043");
    stu2.setGrade(13.5);
    Student  stu3=new Student("reyhane","teymoori","40131042");
    stu3.setGrade(18.0);
    Student  stu4=new Student("fateme","fallah","40131041");
    stu4.setGrade(20);
    Student  stu5=new Student("roya","rahimi","40131040");
    stu5.setGrade(15.0);
    sum+=stu1.getGrade()+stu2.getGrade()+stu3.getGrade()+stu4.getGrade()+stu5.getGrade();
    System.out.println("average: " + sum/5);
    // for print the information of students
    System.out.println();
    stu1.PrintStudentInfo();
    stu2.PrintStudentInfo();
    stu3.PrintStudentInfo();
    stu4.PrintStudentInfo();
    stu5.PrintStudentInfo();

}
}



