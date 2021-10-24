package Programcollection.interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class threadsafearraylist
{
    public static void main(String[] args)
    {
        List<String> synlist = Collections.synchronizedList(new ArrayList<String>());
        synlist.add("C");
        synlist.add("JAVA");
        synlist.add("Python");
        synlist.add("Jscript");
        //add remove no need synchronization----  To fetch traverse need synchronization

        synchronized (synlist){
            Iterator<String> it = synlist.iterator();
            {
                while (it.hasNext())
                {
                    System.out.println(it.next());
                }
            }
        }

        CopyOnWriteArrayList<String> cpy = new CopyOnWriteArrayList<>(synlist);

        Iterator<String> it1=cpy.iterator();
        while (it1.hasNext())
        {
                    String st=it1.next();

                    if(st.equalsIgnoreCase("C"))
                    {
                        System.out.println(st);
                    }
        }



    }
}
