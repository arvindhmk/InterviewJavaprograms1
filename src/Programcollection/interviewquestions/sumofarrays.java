package Programcollection.interviewquestions;

import java.util.Arrays;

public class sumofarrays
{
    public void sumofarrayvalues()
    {
        int[] a = {4,5,6,2,8};
        int sum =0;

        for (int value:a)
        {
            sum=sum+value;
        }
        System.out.println("Sum of array values:"+sum);
    }

    public void oddevenvaluesinarray()
    {
        int[] a = {4,5,6,2,8};

        for (int val:a)
        {
            if(val%2==0)
            {
                System.out.println("Even Numbers:"+val);
            }
           if(val%2!=0)
            {
                System.out.println("Odd Numbers:"+val);
            }
        }
    }
    public void equalarray()
    {
        int[] a1={5,7,9,3,2,4};
        int[] a2={7,9,3,2,4};

        Boolean val = Arrays.equals(a1,a2);
        if(val==true)
        {
            System.out.println("both arrays are equal");
        }
        else
        {
            System.out.println("both arrays are not equal");
        }
    }

    public void equalarray2()
    {
        int[] a1={5,7,9,3,2,4};
        int[] a2={5,7,9,3,2,2};
        boolean status=true;

        if(a1.length==a2.length)
        {
            for (int i=0;i<a1.length;i++)
            {
                if(a1[i]==a2[i])
                {
                    status=true;
                }
                else
                {
                    status = false;
                    break;
                }
            }
        }
        else
        {
            System.out.println("Array length mismatch");
        }

        if (status==true)
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }

    public static void main(String[] args)
    {
        sumofarrays obj = new sumofarrays();
//        obj.sumofarrayvalues();
//        obj.oddevenvaluesinarray();
//        obj.equalarray();
        obj.equalarray2();
    }
}
