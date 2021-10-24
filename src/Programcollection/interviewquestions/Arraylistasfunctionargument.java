package Programcollection.interviewquestions;

import java.util.ArrayList;

public class Arraylistasfunctionargument
{
    public static void display(ArrayList<String> ar)
    {
        System.out.println(ar);

    }

    public static void arval(String[] sar1)
    {
        for (String val: sar1) {
            System.out.println(val);
        }

//        System.out.println(sar1);
    }



    public static void main(String[] args)
    {

        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("JAVA");
        ar1.add("C");
        ar1.add("C++");
//      Arraylistasfunctionargument.display(ar1);
      ArrayList<String> ar2 = new ArrayList<>();
      ar2.addAll(ar1);


        Arraylistasfunctionargument.arval(ar2.toArray(new String[ar2.size()]));
    }
}
