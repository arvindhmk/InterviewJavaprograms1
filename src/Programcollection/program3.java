//Convert String array tp list

package Programcollection;

import java.util.ArrayList;
import java.util.Arrays;

public class program3
{
    public static void main(String[] args)
    {
        String lang = "Java,python,C";
        String[] langarr = lang.split(",");

        ArrayList<String> l1 = new ArrayList<>(Arrays.asList(langarr));
        System.out.println(l1);
    }
}
