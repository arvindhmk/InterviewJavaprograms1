package Programcollection.interviewquestions;

import java.util.stream.IntStream;

public class reverstring
{
    public String reverse(StringBuilder rev)
    {
       return IntStream.range(0,rev.length()).map(i->rev.charAt(rev.length()-i-1)).collect(StringBuilder::new,(s,c) ->s.append((char)c),StringBuilder::append).toString();
    }

    public void stringrev1(String str)
    {
        int len=str.length();
        String rev1 ="";
        for (int i=len-1;i>=0;i--)
        {
            rev1=rev1+str.charAt(i);
        }
        System.out.println("Reversed String:"+rev1);
    }

    public void stringrev2(String str)
    {
        int len=str.length();
        String rev1 ="";
        char[] st= str.toCharArray();
        for (int i=len-1;i>=0;i--)
        {
            rev1=rev1+st[i];
        }
        System.out.println("Reversed String:"+rev1);
    }

    public StringBuffer reverse3(StringBuffer st2)
    {
        System.out.println(st2.reverse());
        return st2;
    }
    public static void main(String[] args)
    {
        reverstring rev = new reverstring();
//        StringBuilder st = new StringBuilder("JAVA");
//        System.out.println(rev.reverse(st));
//        rev.stringrev1("JAVA");
//        rev.stringrev2("JAVA");
        rev.reverse3(new StringBuffer("JAVA"));
    }

}
