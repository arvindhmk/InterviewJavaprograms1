package Programcollection.interviewquestions;

public class patternprograms {
    public void increasingTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void decreasingTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void rightsidedTriangle1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void rightsidedTriangle2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= num; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void hillPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("* ");
            }
            for (int v = 1; v <= i; v++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void reverseHillpattern(int num)
    {
        for (int i=1;i<=num;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for (int k=i;k<=num;k++)
            {
                System.out.print("* ");
            }
            for (int v=i;v<num;v++)
            {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }

    public void diomandPattern(int num) {

        for (int i = 1; i < num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("* ");
            }

            for (int v = 1; v <= i; v++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < num; k++) {
                System.out.print("* ");
            }

            for (int v = i; v <= num; v++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pyramidPattern(int num)
    {
        for (int i=1;i<=num;i++)
        {
            for (int j=i;j<=num;j++)
            {
                System.out.print("  ");
            }
            for (int k=1;k<i;k++)
            {
                System.out.print("* ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void inversepyramidPattern(int num)
    {
        for (int i=1;i<=num;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for (int k=i;k<=num;k++)
            {
                System.out.print("* ");
            }
            for (int k=i;k<num;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void sandGlass(int num)
    {
        for (int i=1;i<=num;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }

            for (int k=i;k<=num;k++)
            {
                System.out.print("* ");
            }
            for (int k=i;k<num;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=1;i<=num;i++)
        {
            for (int j=i;j<=num;j++)
            {
                System.out.print("  ");
            }
            for (int k=1;k<i;k++)
            {
                System.out.print("* ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }



    public static void main(String[] args)
    {
        patternprograms pat = new patternprograms();
//        pat.increasingTriangle(5);
//        pat.decreasingTriangle(5);
//        pat.rightsidedTriangle1(5);
//        pat.rightsidedTriangle2(5);
//        pat.hillPattern(5);
//        pat.reverseHillpattern(5);
        pat.diomandPattern(5);
//        pat.inversepyramidPattern(5);
//        pat.sandGlass(5);
    }
}
