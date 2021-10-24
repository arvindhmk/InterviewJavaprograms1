package Programcollection.interviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex3
{
    public static void main(String[] args)
    {
//        Pattern p = Pattern.compile("\\s");
//        Pattern p = Pattern.compile("\\S");
//        Pattern p = Pattern.compile("\\d");
//        Pattern p = Pattern.compile("\\D");
//        Pattern p = Pattern.compile("\\w");
//        Pattern p = Pattern.compile("\\W");
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher("a7b k 9A%");
        while (m.find())
        {
            System.out.println(m.start()+".."+m.group());
        }
    }
}
