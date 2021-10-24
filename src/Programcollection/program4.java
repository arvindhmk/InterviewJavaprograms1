package Programcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class program4
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arl = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5));
        System.out.println(arl);
        Set<Integer> ars = new LinkedHashSet<Integer>(arl);
//        System.out.println(ars);
        arl.clear();
        arl.addAll(ars);
        System.out.println("Arraylist without duplicate numbers:"+arl);
    }
}
