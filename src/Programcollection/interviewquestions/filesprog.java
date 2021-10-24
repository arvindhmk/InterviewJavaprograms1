package Programcollection.interviewquestions;

import java.io.*;

public class filesprog
{
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("one.txt");
        File f2 = new File("two.txt");
        File f3 = new File("three.txt");
        f1.createNewFile();
        f2.createNewFile();
        f3.createNewFile();
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f3.getAbsolutePath());


//        FileReader fr1 = new FileReader("src\\Programcollection\\interviewquestions\\one.txt");
//        FileReader fr2 = new FileReader("src\\Programcollection\\interviewquestions\\two.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(f1));
        BufferedReader br2 = new BufferedReader(new FileReader(f2));
        PrintWriter pw = new PrintWriter(f3);
        BufferedWriter br3 = new BufferedWriter(pw);
        String line1 = br1.readLine();
        while (line1!=null)
        {
            boolean available = false;
            String line2 = br2.readLine();
            while (line2!=null)
            {
                if (line1.equals(line2))
                {
                    available=true;
                    break;
                }
                line2 = br2.readLine();
            }
            if (available == false)
            {
                pw.println(line1);
            }
            line1=br1.readLine();
        }
        br1.close();
        br2.close();
        pw.flush();
        }
}
