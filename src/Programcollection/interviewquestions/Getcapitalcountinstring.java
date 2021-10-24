package Programcollection.interviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Getcapitalcountinstring
{
    public static void main(String[] args)
    {
        String str="iSoftwarreTestingInterviewPrograms";

        int count=0;
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                count++;
            }
        }
        System.out.println(count);


        int count1=0;
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                count1++;
            }
        }
        System.out.println(count1);

        int count2=0;
        for (int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                count2++;
            }
        }
        System.out.println(count2);

long count3= str.chars().filter(e->e>=65 && e<=90).count();
        System.out.println(count3);

        String regex = "[A-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int count6=0;
        while (matcher.find())
        {
            count6+=matcher.group().length();
        }
        System.out.println(count6);

    }

}
