package Programcollection.interviewquestions;

public class Student
{
    private String name;
    private int roll_num;
    private int marks;
    private int age;

    public Student(String name,int roll_num,int marks,int age)
    {
        this.name=name;
        this.age=age;
        this.roll_num=roll_num;
        this.marks=marks;
    }

    public String getName()
    {
        return name;
    }

    public int getRoll_num()
    {
        return roll_num;
    }

    public int getAge()
    {
        return age;
    }

    public int getMarks()
    {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_num=" + roll_num +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}
