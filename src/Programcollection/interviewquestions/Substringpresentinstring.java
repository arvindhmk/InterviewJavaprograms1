package Programcollection.interviewquestions;

public class Substringpresentinstring
{
    public boolean getsubstring(String main, String sub)
    {
        return main.matches("(.*)"+sub+"(.*)");
    }

    public boolean getsubstring1(String main, String sub)
    {
        return main.contains(sub);
    }
    public boolean getsubstring2(String main, String sub)
    {
        return main.indexOf(sub)!=-1;
    }

    public static void main(String[] args)
    {
        Substringpresentinstring sub = new Substringpresentinstring();
        System.out.println(sub.getsubstring("Software Test Engineer","Engn"));
        System.out.println(sub.getsubstring1("Software Test Engineer","Engn"));
        System.out.println(sub.getsubstring2("Software Test Engineer","Engn"));
    }
}
