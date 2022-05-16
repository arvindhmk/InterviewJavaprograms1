package Programcollection.interviewquestions;

import java.util.HashMap;
import java.util.Iterator;

public class uniquevaluesfromstring
{
    public static void main(String[] args)
    {
        String s1 = "Himalayas";
        char[] st = s1.toCharArray();
        HashMap<Character,Integer> uni= new HashMap<>();

        for (Character ch : st )
        {
            if((uni.containsKey(ch))==false)
            {
                uni.put(ch,1);
            }else
            {
                uni.put(ch,uni.get(ch)+1);
            }
        }

        System.out.println(uni);
        Iterator<Character> it = uni.keySet().iterator();

        Character k=' ';
        StringBuilder sb = new StringBuilder();
        while (it.hasNext())
        {
            k = it.next();
            System.out.println("Key:"+k);
            if(uni.get(k)==1)
            {
                sb.append(k);
            }
        }
        System.out.println("Unique values in string:"+ sb);



    }
}
