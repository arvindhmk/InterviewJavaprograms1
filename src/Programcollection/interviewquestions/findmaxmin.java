package Programcollection.interviewquestions;

public class findmaxmin
{
    public static void main(String[] args)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int[] num = new int[]{87,57,-9,56,87,44,-55};

        int maxval = Integer.MIN_VALUE;
        int minval = Integer.MAX_VALUE;

        for (int i=0;i<num.length;i++)
        {
            if(num[i]>maxval) {
                maxval = num[i];
            }
            if(num[i]<minval)
            {
                minval=num[i];
        }
        }
        System.out.println("Maxvalue:"+maxval);
        System.out.println("Maxvalue:"+minval);

    }

}
