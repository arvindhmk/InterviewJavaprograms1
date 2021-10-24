package Programcollection.interviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex7
{
    public void email(String s)
    {
        Pattern p = Pattern.compile("[a-z A-Z 0-9][a-z A-Z 0-9 _.]*@[a-z A-Z 0-9]+([.][a-z A-Z]+)+");
        Matcher m = p.matcher(s);
        if(m.matches())
        {
            System.out.println("Mail ID is valid");
        }
        else
        {
            System.out.println("Mail ID is Invalid");
        }
    }


    public static void main(String[] args)
    {
        regex7 reg = new regex7();
        reg.email("jegan1883@gmmail.com");

    }
}
