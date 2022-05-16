package Programcollection.interviewquestions;

import java.util.HashSet;

public class findduplicateelementinarray
{
    public static void main(String[] args)
    {
        String arr[] = {"Selenium","QTP","CYPRESS","CYPRESS","Selenium"};
//Approach1
            Boolean flag = true;
//            for(int i=0;i<arr.length;i++)
//            {
//                for (int j=i+1;j<arr.length;j++)
//                {
//                    if(arr[i]==arr[j])
//                    {
//                        System.out.println("Duplicate element in array:"+arr[i]);
//                        flag = false;
//                    }
//                }
//            }
//if (flag==true) {
//    System.out.println("No duplicate element in array");
//}

//        Approach2

        HashSet<String> hs = new HashSet<>();
        for ( String val:arr)
        {
            if(hs.add(val)==false)
            {
                System.out.println("duplicate array value:"+val);
                flag=false;
                break;
            }
        }
        if (flag==true)
        {
            System.out.println("No duplicate string n the given array");
        }

    }
}
