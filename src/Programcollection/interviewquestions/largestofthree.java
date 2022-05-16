package Programcollection.interviewquestions;

import java.util.Random;

public class largestofthree
{
    public void largenumber(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a+":largest number");
        }
        else
        {
            if(b>a && b>a)
            {
                System.out.println(b+":largest number");
            }
            else {
                System.out.println(c+":largest number");
            }
        }
    }
    public void largenumberusingternary(int a,int b,int c)
    {
        int largenum1 = a>b?a:b;
        int largenum2 = largenum1>c?largenum1:c;
        int largenum = c>(a>b?a:b)?c:(a>b?a:b);

        System.out.println(":largest number:"+largenum);
    }

    public void fibonacci(int limit)
    {
        int a=0,b=1,sum=0;
        System.out.print(a+" "+b+" ");

        for (int i=2;i<=limit;i++)
        {
            sum = a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }

    }

    public void generaterandomnum()
    {
        Random ran = new Random();

        System.out.println(ran.nextInt(50));
//        System.out.println(ran.nextDouble()*1000000);
        int val = (int) (ran.nextDouble()*1000000);

        System.out.println("666"+val);

        System.out.println(Math.random());
    }

    public void factorial(int num)
    {
        int fact=1;
        for (int i=1;i<=num;i++)
        {
            fact = fact*i;
            System.out.print(fact+" ");
        }
        System.out.println("The factorial value:"+fact);
    }

    public static void main(String[] args)
    {
        largestofthree large = new largestofthree();
//        large.largenumber(10,9,0);
//        large.largenumberusingternary(10,9,0);
//        large.fibonacci(20);
//        large.generaterandomnum();
        large.factorial(7);
    }
}
