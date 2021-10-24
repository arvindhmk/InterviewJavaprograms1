package Programcollection.interviewquestions;

import java.util.function.Predicate;

public class lambdaexp
{

    public static void main(String[] args)
    {
        String[] s = {"AMARNATH","ARJUN","AVENASH","ARUNKUMAR"};
        Predicate<String> p = s1->s1.length()>5;
        for (String s1:s)
        {
            System.out.println(p.test(s1));
        }



    }
}
