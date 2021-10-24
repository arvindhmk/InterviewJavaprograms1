package Programcollection.interviewquestions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class pred
{
    String name;
    Double salary;

    pred(String name,double salary)
    {
        this.name = name;
        this.salary = salary;
    }
}
class test
{
    public static void main(String[] args)
    {
        ArrayList<pred> pr = new ArrayList<pred>();

        pr.add(new pred("kumar",4444));
        pr.add(new pred("Thillai",5555));
        pr.add(new pred("Natarajar",6666));
        pr.add(new pred("Asoku",9999));

        Predicate<pred> p = i-> i.salary>5000;
        Predicate<pred> p1 = i-> i.name.length()<6;
        for (pred s:pr)
        {
//            if (p.and(p1).test(s))
//            if (p.or(p1).test(s))
            if (p.and(p1.negate()).test(s))
            {
                System.out.println(s.name+":"+s.salary);

            }
        }

    }
}
