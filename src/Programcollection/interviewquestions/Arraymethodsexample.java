package Programcollection.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraymethodsexample
{
    public static void main(String[] args)
    {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("C","C++","JAVA","PHYTHON","JAVASCRIPT","RUBY","PEARL"));
        ArrayList<String> str1 = new ArrayList<>(str.subList(0,3));
        System.out.println(str1);

//        str.retainAll(str1);
        str.retainAll(Collections.singleton("C"));
        System.out.println(str);

        ArrayList<String> str2 = new ArrayList<>(Arrays.asList("C","C++","JAVA","PHYTHON","JAVASCRIPT","RUBY","PEARL"));
        Object[] arobj = str2.toArray();
        System.out.println(Arrays.toString(arobj));

        for (Object ar:arobj)
        {
            System.out.println((String) ar);
        }
    }
}
