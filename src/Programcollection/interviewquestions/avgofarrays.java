package Programcollection.interviewquestions;

import com.google.common.math.DoubleMath;

import java.util.Arrays;
import java.util.OptionalDouble;

public class avgofarrays
{
    public static void main(String[] args)
    {
        int[] num = {6,8,7,9,5,2,3,1};
        int total=0;
        double avg = DoubleMath.mean(num);
        System.out.println(avg);

        for(int i=0;i<num.length;i++)
        {
            total=total+num[i];
        }
        total=total/num.length;
        System.out.println(total);

        OptionalDouble avg1 = Arrays.stream(num).average();
        System.out.println(avg1.getAsDouble());
    }
}
