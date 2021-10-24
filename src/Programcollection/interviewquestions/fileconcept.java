package Programcollection.interviewquestions;

import java.util.Arrays;

public class fileconcept
{
    public static void main(String[] args)
    {
        Object[] ar = new Object[500];

        int i = ar.length;
        int j=0;
        while( j < i)
        {

            ar[j]=j;
            j++;

        }
        System.out.println(Arrays.toString(ar));
    }
}
