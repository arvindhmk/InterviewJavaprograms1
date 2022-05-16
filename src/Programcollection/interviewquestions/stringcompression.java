package Programcollection.interviewquestions;

import java.util.*;

public class stringcompression
{
    public static void main(String[] args)
    {

        String s = "sairishvanth";

        HashMap<Character,Integer> hm = new LinkedHashMap<>();

        for (int i=0;i<s.length();i++)
        {
            if(hm.get(s.charAt(i))!=null)
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }

        StringBuilder sb = new StringBuilder();
        Set set=hm.entrySet();
        Iterator iterator =set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry menter = (Map.Entry) iterator.next();
            sb.append(menter.getKey());
            sb.append(menter.getValue());
        }
        System.out.println(sb.toString());


    }
}
