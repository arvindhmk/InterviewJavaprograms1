package Programcollection.interviewquestions;

public class starpattern
{
//    *
//    **
//    ***
//    ****
//    *****

//    *****
//    ****
//    ***
//    **
//    *



    public static void main(String[] args)
    {

        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

//           *
//          **
//         ***
//        ****
//       *****


        for (int i=0;i<=4;i++)
        {
            for (int j=3;j>=i;j--)
            {
                System.out.print(" ");
            }

            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

//A
//A B
//A B C
//A B C D
//A B C D E
//A B C D E F

        int Alpha=65;

        for (int i=0;i<6;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(Alpha+j));
            }
            System.out.println();
        }

//A
//B B
//C C C
//D D D D
//E E E E E
//F F F F F F

for(int i=0;i<6;i++)
{
    for(int j=0;j<=i;j++)
    {
        System.out.print((char)Alpha+" ");
    }
    Alpha++;
    System.out.println("");
}

//         *
//        * *
//       * * *
//      * * * *
//     * * * * *

        for(int i=0;i<=4;i++)
        {

            for(int k=4;k>i;k--)
            {
                System.out.print(" ");
            }

            for (int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
