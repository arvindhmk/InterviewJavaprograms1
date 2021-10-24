package Programcollection.interviewquestions;

import java.util.stream.IntStream;

public class print1to100
{
    public void printnum(int num)
    {
        if(num<=100)
        {
            System.out.println(num);
            num++;
            printnum(num);
        }
    }

    public void usingStreams()
    {
        IntStream.range(1,101).forEach(e -> System.out.println(e));
    }

    public static void main(String[] args)
    {

        print1to100 p = new print1to100();
//        p.printnum(1);
        p.usingStreams();
    }
}
