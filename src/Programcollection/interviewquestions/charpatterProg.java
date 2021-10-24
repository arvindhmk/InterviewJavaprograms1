package Programcollection.interviewquestions;

public class charpatterProg
{
    public void triangleOne(int num)
    {
        for (int i=1,p='A';i<=num;i++,p++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E
    }

    public void triangleTwo(int num)
    {
//        A
//        B B
//        A A A
//        B B B B
//        A A A A A

        for (int i=1;i<=num;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if (i%2==0)
                {
                    System.out.print("B ");
                }
                else
                {
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
    }

    public void triangleThree(int num)
    {
//                 A
//               B B B
//             C C C C C
//          D D D D D D D D
//        E E E E E E E E E E
//           F F F F F F F F
//             G G G G G
//               H H H
//                 I
      char p='A';
   for (int i=1;i<num;i++,p++)
   {
       for (int j=i;j<=num;j++)
       {
           System.out.print("  ");
       }
       for (int k=1;k<i;k++)
       {
               System.out.print((char)p+" ");
       }
       for (int b=1;b<=i;b++)
       {
           System.out.print((char)p+" ");
       }
       System.out.println();
   }
        for (int i=1;i<=num;i++,p++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for (int k=i;k<num;k++)
            {
                System.out.print((char)p+" ");
            }
            for (int b=i;b<=num;b++)
            {
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
 }

    public void triangleFour(int num)
    {
        for (int i=1,p='A';i<num;i++,p++)
        {
            for (int j=i;j<=num;j++)
            {
                System.out.print("  ");
            }
            for (int k=1;k<i;k++)
            {
                System.out.print((char)p+" ");
            }
            for (int b=1;b<=i;b++)
            {
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
        for (int i=1,p='E';i<=num;i++,p--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for (int k=i;k<num;k++)
            {
                System.out.print((char)p+" ");
            }
            for (int b=i;b<=num;b++)
            {
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
    }

    public void triangleFive(String s)
    {
        int n = s.length();
        for (int i=1,p=4;i<=n;i++,p--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(s.charAt(p)+" ");
            }
            System.out.println();
        }
    }

    public void diamondShape(int num)
    {
        for (int i=1,p='A';i<num;i++,p++)
        {
            for (int j=i;j<=num;j++)
            {
                System.out.print("  ");
            }
            for (int k=1;k<i;k++)
            {
                System.out.print((char)p+" ");
            }
            for (int v=1;v<=i;v++)
            {
                System.out.print((char)p+" ");
            }
            System.out.println();
        }

        for (int i=1,p='E';i<=num;i++,p++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for (int k=i;k<num;k++)
            {
                System.out.print((char)p+" ");
            }
            for (int v=i;v<=num;v++)
            {
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {

        charpatterProg cp = new charpatterProg();
//        cp.triangleOne(5);
//        cp.triangleTwo(5);
//        cp.triangleThree(5);
//        cp.triangleFour(5);
//        cp.triangleFive("ABCDE");
          cp.diamondShape(5);
    }
}
