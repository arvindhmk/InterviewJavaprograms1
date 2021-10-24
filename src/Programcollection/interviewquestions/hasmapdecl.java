package Programcollection.interviewquestions;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hasmapdecl
{
//static maps
    public static HashMap<String,Integer> marksmap;
    static
    {
        marksmap = new HashMap<>();
        marksmap.put("A",100);
        marksmap.put("B",200);
        marksmap.put("C",300);
        marksmap.put("D",400);
    }
    public static void main(String[] args)
    {
        System.out.println(hasmapdecl.marksmap.get("A"));

        //Immutable map with only one single entry

        Map<String,String> map1 =  Collections.singletonMap("India","New Delhi");
        System.out.println(map1.get("India"));

        //Creating 2D array of strings using stream and collecting in form of map
        Map<String,String> map2=Stream.of(new String[][]
        {
            {"TOM","A Grade"},
            {"JERRY","B Grade"},})
                .collect(Collectors.toMap(data -> data[0],data -> data[1]));
        System.out.println(map2.get("TOM"));
        map2.put("LISA","B+ Grade");
        System.out.println(map2.get("LISA"));

        //Simple entry mutable map

       Map<String,String> map3 = Stream.of(
               new AbstractMap.SimpleEntry<>("Arvindh","Java"),
                new AbstractMap.SimpleEntry<>("MK","GCP"))
               .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map3.get("MK"));
        map3.put("ARVI","AWS");
        System.out.println(map3.get("ARVI"));

//Empty map

        Map<String,String> map4 = Map.of();
//        map4.put("k1","v1"); UnsupportedOperationException

//singletonmap
        Map<String,String> map5 = Map.of("k1","v1");
        System.out.println(map5.get("k1"));
//        map5.put("US","Dollar");UnsupportedOperationException

//Multimap

        Map<String,String> map6 = Map.of("K1","V1","K2","V2");
        System.out.println(map6.get("K2"));


        Map<String,String> map7 = Map.ofEntries( new AbstractMap.SimpleEntry<>("KK","VV"),
                       new AbstractMap.SimpleEntry<>("KK1","VV1"));
        System.out.println(map7.get("KK1"));


    }

}
