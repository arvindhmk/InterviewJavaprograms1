package Programcollection.interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findduplicateelementsinarray
{
    String[] cloudservice = {"GCP","AWS","AZURE","GCP","Ali Baba","Ali Baba","SauceLabs"};

    public void findduplicate() {
//        for(int i=0;i<cloudservice.length;i++)
//        {
//            for(int j=i+1;j<cloudservice.length;j++)
//            {
//                if(cloudservice[i].equals(cloudservice[j]))
//                {
//                    System.out.println("Duplicated array value "+cloudservice[i]);
//                }
//            }
//        }

//        Set<String> data = new HashSet<String>();
//        for (String e:cloudservice)
//        {
//            if(data.add(e)==false)
//            {
//                System.out.println("duplicate value:"+e);
//            }
//        }
//    }

        Map<String, Integer> inframap = new HashMap<String, Integer>();

        for (String e : cloudservice) {
            Integer count = inframap.get(e);
            if (count == null) {
                inframap.put(e, 1);
            } else {
                inframap.put(e, ++count);
            }
        }

            Set<Map.Entry<String,Integer>> entrset = inframap.entrySet();
            for (Map.Entry<String,Integer> entry:entrset )
            {
             if(entry.getValue()>1)
             {
                 System.out.println(entry.getKey());
             }
            }

        }



    public static void main(String[] args)
    {
        findduplicateelementsinarray finddupfindduplicateelementsinarray = new findduplicateelementsinarray();
        finddupfindduplicateelementsinarray.findduplicate();
    }
}
