package Programcollection.interviewquestions;

public class passnullargumentinmethodoverloading
{

    public static void test(Object a)
    {
        System.out.println("Object "+a);
    }

    public static void test(String a)
    {
        System.out.println("String "+a);
    }

//    public static void test(StringBuilder a)
//    {
//        System.out.println("Stringbuilder "+a);
//    }
    public static void main(String a[])
    {
        test(null);
    }

}
