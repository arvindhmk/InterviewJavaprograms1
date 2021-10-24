package Programcollection.interviewquestions;

import java.util.stream.IntStream;

public class reverstring
{
    public String reverse(StringBuilder rev)
    {
       return IntStream.range(0,rev.length()).map(i->rev.charAt(rev.length()-i-1)).collect(StringBuilder::new,(s,c) ->s.append((char)c),StringBuilder::append).toString();
    }


    public static void main(String[] args)
    {
        reverstring rev = new reverstring();
        StringBuilder st = new StringBuilder("JAVA");
        System.out.println(rev.reverse(st));
    }

}
