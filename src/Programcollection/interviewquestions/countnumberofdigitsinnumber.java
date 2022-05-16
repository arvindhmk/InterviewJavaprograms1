package Programcollection.interviewquestions;

public class countnumberofdigitsinnumber
{
    public void numerofdigits(int num)
    {
        int count=0;

        while (num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println("Total number ofdigits:"+count);
    }

    public void numberofoddevendigits(int num)
    {
        int evencount=0;
        int oddcount=0;

        while (num>0)
        {
            int rem=num%10;
            if (rem%2==0)
            {
               evencount++;
            }
            else
            {
                oddcount++;
            }
            num=num/10;
        }

        System.out.println("Even count:"+evencount);
        System.out.println("Odd count:"+oddcount);
    }

    public void sumofdigits(int num)
    {
        int sum=0;
        while (num>0) {
            sum = sum + num % 10;
            num=num/10;
        }
        System.out.println("Sum of values:"+sum);
    }
    public static void main(String[] args)
    {
        countnumberofdigitsinnumber co = new countnumberofdigitsinnumber();
//        co.numerofdigits(765654);
//        co.numberofoddevendigits(9999);
        co.sumofdigits(987);
    }
}
