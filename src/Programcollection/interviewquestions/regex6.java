package Programcollection.interviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex6 {
    public void validation(String s) {
        Pattern p = Pattern.compile("(0|91)?[987][0-9]{9}");
        Matcher m = p.matcher(s);
        if (m.matches()) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }

    }

    public static void main(String[] args) {
        regex6 reg = new regex6();
        reg.validation("09187654325");

    }
}
