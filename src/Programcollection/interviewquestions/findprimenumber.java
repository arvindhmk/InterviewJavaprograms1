package Programcollection.interviewquestions;

public class findprimenumber
{
    public static void main(String[] args) {
        int num = 80;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
            if(count==2)
            {
                System.out.println("The given number is prime");
            }
            else
            {
                System.out.println("the given number is not prime");
            }
    }
}
