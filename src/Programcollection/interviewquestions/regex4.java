package Programcollection.interviewquestions;

import java.util.regex.Pattern;

public class regex4
{
    public static void main(String[] args)
    {

//        Pattern p = Pattern.compile("\\s");
//        String[] splitstring = p.split("Software Testing Tutorials");

        Pattern p = Pattern.compile("\\.");
        String[] splitstring = p.split("www.google.com");
        for (String s:splitstring)
        {
            System.out.println(s);
        }
    }

}
