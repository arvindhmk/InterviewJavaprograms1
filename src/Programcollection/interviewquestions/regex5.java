package Programcollection.interviewquestions;

import java.util.StringTokenizer;

public class regex5
{
    public static void main(String[] args)
    {
//        StringTokenizer st = new StringTokenizer("Software Testing with Jave");
        StringTokenizer st = new StringTokenizer("24/07/1991");
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken("/"));
        }
    }
}
