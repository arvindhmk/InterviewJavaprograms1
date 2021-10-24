//Convert arraylist to string
package Programcollection;

import java.util.ArrayList;
import java.util.List;

public class program2
{
    public static void main(String[] args)
    {
        List<String> ar = new ArrayList<String>();
        ar.add("S");
        ar.add("T");
        ar.add("R");

        System.out.println(ar);

//        String arsting = ar.toString();
        String arsting = String.join(",",ar);
        System.out.println(arsting);
    }
}
