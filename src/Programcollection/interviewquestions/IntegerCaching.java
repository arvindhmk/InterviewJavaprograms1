package Programcollection.interviewquestions;

public class IntegerCaching
{
    public static void main(String[] args)
    {
        //Values from -128 to 127 will autobox and follow integer caching
        Integer num1=-129;
        Integer num2=-129;

        if(num1==num2)
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("both are not equal");
        }
    }
}
