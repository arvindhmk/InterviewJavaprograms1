package Programcollection.interviewquestions;

import java.util.Arrays;
import java.util.Stack;

public class stringreltedinterviewprograms
{
    public boolean isanagram(String s1,String s2)
    {
        s1=s1.replaceAll("\\s","");
        s2=s2.replaceAll("\\s","");

        System.out.println(s1.length());
        System.out.println(s2.length());
        if (s1.length()==s2.length())
        {
            char[] c1 = s1.toLowerCase().toCharArray();
            char[] c2 = s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
        }
        else
    {
        return false;
    }
  }

  public void reverseeachwordinstring(String st)
  {

      String[] str = st.split(" ");
      String reversestring="";
      for (String w:str)
      {
          String strnew = "";
          for (int i=w.length()-1;i>=0;i--)
          {
              strnew = strnew+w.charAt(i);
          }
          reversestring=reversestring+strnew+" ";
      }
      System.out.println("reversed each word in string:"+reversestring);

  }
    public void reverseeachwordinstring1(String st)
    {
        String[] str = st.split("\\s");

        String reversedword="";

        for (String w:str)
        {
           StringBuffer sb = new StringBuffer(w);
           sb.reverse();
           reversedword=reversedword+sb.toString()+" ";
        }
        System.out.println("Reversed String:"+reversedword);
    }

    public void stringformationvalid()
    {
        String st = new String("{{(}}");

        Stack<Character> sta = new Stack<>();

           for (int i=0;i<st.length();i++)
           {
                char ch = st.charAt(i);

                if(sta.isEmpty())
                {
                    sta.push(ch);
           }else  if(ch=='{' || ch=='[' || ch=='(')
                {
                    sta.push(ch);
                }
                else if(ch==']' && sta.peek()=='[')
                {
                    sta.pop();
                }
                else if(ch=='}' && sta.peek()=='{')
                {
                    sta.pop();
                }
                else
                if(ch==')' && sta.peek()=='(')
                {
                    sta.pop();
                }
           }

           if (sta.isEmpty())
           {
               System.out.println("String formation is correct");
           }
           else
           {
               System.out.println("String formation is incorrect");
           }
    }

    public void countnumofdigits()
    {
        String s[]={"asd1","21312f","dfvf5"};

        int sum = 0;
        for (int i=0;i<s.length;i++)
        {
            String s1= s[i];
            for (int j=0;j<s1.length();j++)
            {
            if (Character.isDigit(s1.charAt(j)))
            {
                sum=sum+Integer.parseInt(String.valueOf(s1.charAt(j)));
            }
        }}
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        stringreltedinterviewprograms obj = new stringreltedinterviewprograms();
//        System.out.println(obj.isanagram("kaala","aalak"));
//        System.out.println(obj.isanagram("kaala","aal   ak"));
//        System.out.println(obj.isanagram("kaala","aala"));
//        obj.reverseeachwordinstring("Hello World reversed");
//        obj.reverseeachwordinstring1("Hello World reversed");
//        obj.stringformationvalid();
        obj.countnumofdigits();

    }
}
