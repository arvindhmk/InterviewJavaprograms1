package Programcollection.interviewquestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class countofduplicatecharinstring
{
    public static void main(String[] args)
    {
        countofduplicatecharinstring countdup = new countofduplicatecharinstring();
//        countdup.countduplicate("JAVA");
        countdup.countduplicatewithvalue("JAVASCRIPT");
    }

    public void countduplicate(String value)
    {
        if(value==null)
        {
            System.out.println("null string");
        }
        if (value.isEmpty())
        {
            System.out.println("empty string");
        }
        if(value.length()==1)
        {
            System.out.println("Single character string");
        }

        HashSet<Character> setvalue = new HashSet<>();
        char[] cvalue = value.toCharArray();
        for (char svalue:cvalue)
        {
            if(setvalue.add(svalue)==false)
            {
                System.out.println("Duplicate character in string:"+svalue);
            }
        }
    }


    public void countduplicatewithvalue(String value)
    {
        char[] cvalue = value.toCharArray();

        HashMap<Character,Integer> mapval = new HashMap<>();
        for (char chvalue:cvalue)
        {
            Integer count = mapval.get(chvalue);
            if(count==null)
            {
                mapval.put(chvalue,1);
            }
            else
            {
                mapval.put(chvalue,count+1);
            }
        }

        Set<Map.Entry<Character,Integer>> entrySet =  mapval.entrySet();

        for (Map.Entry<Character,Integer> data : entrySet)
        {
            if(data.getValue()>1)
            {
                System.out.println(data.getKey()+":"+data.getValue());
            }
        }

    }
}
