//Join two Lists in JAVA

package Programcollection;

//import org.apache.commons.collections.ListUtils;

import java.util.ArrayList;
import java.util.List;


public class program1
{

    public static void main(String[] args)
    {
        List<String> l1 = new ArrayList<String>();
        l1.add("A");
        List<String> l2 = new ArrayList<String>();
        l2.add("B");
        List<String> l3 = new ArrayList<String>();
        l3.addAll(l1);
        l3.addAll(l2);
//        List<String> l3 = ListUtils.union(l1,l2);
        System.out.println("l1-"+l1);
        System.out.println("l2-"+l2);
        System.out.println("l3-"+l3);
    }
}
