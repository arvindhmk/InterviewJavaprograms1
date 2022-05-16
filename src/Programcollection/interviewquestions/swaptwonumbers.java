package Programcollection.interviewquestions;

public class swaptwonumbers
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;

        System.out.println("Before swapping a and b "+a+" and "+b);

//      Approach1
//        a=a+b;//30
//        b=a-b;//10
//        a=a-b;//20
//

//      Approach2
//        a=a*b;
//        b=a/b;
//        a=a/b;

//        Approach3

//        a=a^b;
//        b=a^b;
//        a=a^b;

//        Approach4

          b=a+b-(a=b);


        System.out.println("Before swapping a and b "+a+" and "+b);
    }
}
