package Programcollection.interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class findnonrepeatedcharacters {
    public static void main(String[] args) {
        String ar1 = "MANHATTAN";
        char[] ar2 = ar1.toCharArray();
        int size = ar2.length;
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (!hmap.containsKey(ar2[i])) {
                hmap.put(ar2[i], 1);
            } else {
                hmap.put(ar2[i], hmap.get(ar2[i]) + 1);
            }
        }

        for (Map.Entry<Character, Integer> hmap2 : hmap.entrySet())
        {

                if(hmap2.getValue()==1)
                {
                    System.out.println(hmap2.getKey());
                }
        }
    }
}