package Programcollection.interviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1
{
    public static void main(String[] args)
    {
        int count=0;
        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher("ababbaba");
        while (matcher.find())
        {
            count++;
            System.out.print(matcher.start());
            System.out.print(matcher.end());
            System.out.print(matcher.group());
            System.out.println();
        }
        System.out.println("no. of occurences "+count);
    }
}
