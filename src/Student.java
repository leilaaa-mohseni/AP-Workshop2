public class Student {
    private String firstName;
    private String lastName;
    private  String id ;
    private double grade;
    public Student(String firstName, String lastName,String id)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        grade=0;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getId() {
        return id;
    }
    public double getGrade() {
        return grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setId(String id) {
    if(id.length()!=7)
    {
        System.out.println("your id is not true");
    }
    else
        this.id = id;
    }
    public void setGrade(double grade)
    {
        if(grade<0 || grade>20)
        {
            System.out.println(" your grade is not true");
        }
        else
            this.grade=grade;
    }
    public void PrintStudentInfo()
    {
        System.out.println(firstName + " " +lastName+ "\nid:" + id + "\ngrade:" + grade);
    }

}
