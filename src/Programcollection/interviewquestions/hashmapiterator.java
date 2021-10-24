package Programcollection.interviewquestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmapiterator
{
    public static void main(String[] args)
    {
        HashMap<String,String> capital = new HashMap<String,String>();
        capital.put("TN","CHENNAI");
        capital.put("KA","BENGALURU");
        capital.put("KL","TRIVANDRUM");
        capital.put("AP","HYDERABAD");
        capital.put("MH","MUMBAI");

            Iterator<String> it=capital.keySet().iterator();

            while (it.hasNext())
            {
                String key = it.next();
                String value = capital.get(key);
                System.out.println("key: "+key+" value: "+value);
            }

        System.out.println("------------------");
            Iterator<Map.Entry<String,String>> it1 =capital.entrySet().iterator();
            while (it1.hasNext())
            {
                Map.Entry<String,String> entry = it1.next();
                System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());

            }

        System.out.println("------------------");

        capital.forEach((k,v)->System.out.println("Key="+k+" Value="+v));

    }
}
