package Programcollection.interviewquestions;

import java.util.Scanner;

public class reversenumber
{
    public static void main(String[] args)
    {
//        Using Algorithm

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to reverse :");
        int num = sc.nextInt();
//
//      int rev=0;
////        while(num!=0) {
//         rev = rev*10 + num%10;
//            num = num / 10;
//        }

//        Using Stringbuffer

//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();
//        Using Stringbuilder

        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();

        System.out.println("The reversed number is:"+rev);
    }
}
