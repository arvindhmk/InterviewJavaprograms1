package Programcollection.interviewquestions;

import java.util.Scanner;

public class removesplchar
{
    public void removesplchar()
    {
        String s = "^&&%&^% selenium 8778687 JAVA";

        s=s.replaceAll("[^A-Za-z0-9]","");
        System.out.println("Special char removed:"+s);

    }

    public void removesplchar1()
    {
        String s = "^&&%&^% selenium 8778687 JAVA";
        String s1="";

        for (int i=0;i<s.length();i++)
        {
            if (Character.isDigit(s.charAt(i))||Character.isAlphabetic(s.charAt(i)))
            {
                s1 = s1+s.charAt(i);
            }
        }

        System.out.println("After removing spl char:"+s1);
    }

    public void removespaces()
    {
        String s1="Java learning good";
        System.out.println("Before replace:"+s1);
        s1 = s1.replaceAll("\\s","");
        System.out.println("After replace:"+s1);
    }

    public void countoccurencesofchar()
    {
        String s1 = "JAVA LEARNING IS GOOD";

        String s2=s1.replaceAll("I","");

        int numberofoccurences = s1.length()-s2.length();
        System.out.println("Number of occurences of A:"+numberofoccurences);
    }

    public void countnumberofwords()
    {

        String word = "Hello Java Learning for Selenium";

        String[] st = word.split(" ");
        int count=0;
        for (String s:st)
        {

            count++;
        }

        System.out.println("number of words:"+count);
    }

    public void countnumberofwords1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String word = sc.nextLine();
        int count = 1;
        System.out.println("Entered word:"+word);
        for (int i=0;i<word.length()-1;i++)
        {
            if((word.charAt(i)==' ')&&(word.charAt(i+1)!=' '))
            {
                    count++;
            }
        }
        System.out.println("Total number of word count:"+count);
    }

    public void reverseeachword()
    {
        String s1 = "HELLO JAVA";
        int len = s1.length();
         String reverse = "";

        for (int i=len-1;i>=0;i--)
        {
            reverse = reverse+s1.charAt(i);
        }

        System.out.println("Reversed String:"+reverse);
    }

    public void reverseeachword1()
    {
        String s = "HELLO JAVA";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }
    public static void main(String[] args)
    {
        removesplchar rm = new removesplchar();
//        rm.removesplchar();
//        rm.removesplchar1();
//        rm.removespaces();
//        rm.countoccurencesofchar();
//        rm.countnumberofwords();
//        rm.countnumberofwords1();
//        rm.reverseeachword();
        rm.reverseeachword1();
    }
}
