package Programcollection.interviewquestions;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findlengthstring
{
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "testing";

        System.out.println(str.toCharArray().length);

        System.out.println(str.split("").length);

        Matcher match =  Pattern.compile("$").matcher(str);
        match.find();
        int len = match.end();
        System.out.println(len);
        int l1=0;
        l1= str.getBytes("UTF-16BE").length/2;
        System.out.println(l1);

    }
}
