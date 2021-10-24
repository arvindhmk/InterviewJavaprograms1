package Programcollection.interviewquestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iteratemapinterface
{
    public static void main(String[] args)
    {

        HashMap<Integer,String> hmap = new HashMap<Integer, String>();
        hmap.put(100,"Sam");
        hmap.put(101,"Adams");
        hmap.put(102,"Paul");
        hmap.put(103,"Steve");
//        for (Map.Entry<Integer,String> hmap1 : hmap.entrySet())
//        {
//            System.out.print("Key :"+hmap1.getKey());
//            System.out.println("value :"+hmap1.getValue());
//
//        }

//        for (int num:hmap.keySet())
//        {
//            System.out.println("Key:"+num);
//        }
//        for (String values:hmap.values())
//        {
//            System.out.println("Values:"+hmap.values());
//        }

        Iterator<Map.Entry<Integer,String>> hmap2 = hmap.entrySet().iterator();

        while (hmap2.hasNext())
        {
            Map.Entry<Integer,String> mapvalue = hmap2.next();
            String values = mapvalue.getValue();
            Integer key = mapvalue.getKey();
            System.out.println("Key is:"+key+" "+"Value is:"+values);
        }

        hmap.forEach((k,v)-> System.out.println("Key:"+k+"Value:"+v));


    }
}
