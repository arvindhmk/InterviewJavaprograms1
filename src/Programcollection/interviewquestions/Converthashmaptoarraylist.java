package Programcollection.interviewquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Converthashmaptoarraylist
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> compMap = new HashMap<>();
        compMap.put("Google",23423);
        compMap.put("IBM",24443);
        compMap.put("Facebook",98768);
        compMap.put("HP",245453);
        compMap.put("Microsoft",23098);

        Iterator it = compMap.entrySet().iterator();

        while (it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.print(pair.getKey()+":");
            System.out.println(pair.getValue());
        }

        ArrayList<String> Comp = new ArrayList<>(compMap.keySet());
        System.out.println("Total :"+ Comp.size());
        for (String str:Comp)
        {
            System.out.println("Keys:"+str);
        }
        ArrayList<Integer> Comp1 = new ArrayList<Integer>(compMap.values());
        System.out.println("Total :"+ Comp1.size());
        for (int str:Comp1)
        {
            System.out.println("Values:"+str);
        }

    }
}
