package Programcollection.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Student1
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Tom",1,90,15);
        Student s2 = new Student("Peter",2,80,16);
        Student s3 = new Student("Lisa",3,55,16);
        Student s4 = new Student("Robby",4,90,16);
        Student s5 = new Student("Naveen",5,70,16);


        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);


        System.out.println("total number Students "+studentList.size());


        for (Student s:studentList)
        {
            System.out.println(s);
        }

        studentList.stream().filter(e->e.getMarks()>80).forEach(e-> System.out.println(e.getName()+":"+e.getMarks()));

        int hm = studentList.stream().map(e->e.getMarks()).max(Integer::compare).get();
        System.out.println("Highest mark:"+hm);
    }
}
