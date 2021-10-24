package Programcollection.interviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2
{
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("[abc]");
        Pattern p1 = Pattern.compile("[a-z]");
        Pattern p2 = Pattern.compile("[A-Z]");
        Pattern p3 = Pattern.compile("[0-9]");
        Pattern p4 = Pattern.compile("[^a-z]");
        Pattern p5 = Pattern.compile("[^0-9]");
        Pattern p6 = Pattern.compile("[A-Z a-z 0-9]");
        Pattern p7 = Pattern.compile("[^A-Z a-b 0-9]");
//        Matcher m = p.matcher("a&89JKx#");
//        Matcher m = p1.matcher("a&89nJKx#");
//        Matcher m = p2.matcher("a&89JKx#");
//        Matcher m = p3.matcher("a&89JKx#");
//        Matcher m = p4.matcher("a&89JKx#");
//        Matcher m = p5.matcher("a&89JKx#");
//        Matcher m = p6.matcher("a&89JKx#");
        Matcher m = p7.matcher("a&89JKx#");
        while (m.find())
        {
            System.out.println(m.start()+"..."+m.group());
        }
    }
}
