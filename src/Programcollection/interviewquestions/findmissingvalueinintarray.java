package Programcollection.interviewquestions;

public class findmissingvalueinintarray
{
    public static void main(String[] args)
    {
        int[] num = {1,2,3,5,6,7,8,10,9};

        int totalVal=10;
        findmissingvalueinintarray obj = new findmissingvalueinintarray();
        System.out.println(obj.findmissingintval(num,totalVal));


    }

    public int findmissingintval(int num[],int totalVal)
    {
        int expsum = (totalVal*(totalVal+1)/2);
        int initialVal=0;
        for (int i:num) {
            initialVal=initialVal+i;
        }

        int missingint =expsum-initialVal;
                return missingint;
    }
}
