package Programcollection.interviewquestions;

import java.util.Arrays;

public class shiftallzerotoright
{
    public static int[] shiftright(int[] a)
    {
        if(a.length==1)
        {
            return a;
        }
        int count=0;
        int[] newArray= new int[a.length];
        if(a.length>1)
        {
            for (int num:a)
            {
               if(num!= 0)
               {
                   newArray[count]=num;
                   count++;
               }
            }
        }
        return newArray;
    }
    public static void main(String[] args)
    {
        int[] val = new int[] {0,0,3,6,7,0,0,0};
        System.out.println(Arrays.toString(shiftright(val)));
    }
}
