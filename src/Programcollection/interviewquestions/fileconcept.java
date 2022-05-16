package Programcollection.interviewquestions;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class fileconcept {

    public void prg1() {
        Object[] ar = new Object[500];

        int i = ar.length;
        int j = 0;
        while (j < i) {

            ar[j] = j;
            j++;

        }
        System.out.println(Arrays.toString(ar));
    }


    public void filereader() throws IOException {

        FileReader fr = new FileReader("E:\\testdoc.txt");
        BufferedReader br = new BufferedReader(fr);

        String st = "";
        while ((st = br.readLine())!=null)
        {
            System.out.println(st);
        }

        br.close();
    }

    public void filereader1() throws IOException {

        File f = new File("E:\\testdoc.txt");
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine())
        {
//            System.out.println(sc.next());
            sc.useDelimiter("\\Z");
            System.out.println(sc.next());
        }

    }

    public void filewrite() throws IOException {
        FileWriter fw = new FileWriter("E:\\test1doc.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Selenium");
        bw.newLine();
        bw.write("JAVA");
        bw.newLine();
        bw.write("TestNG");
        bw.newLine();
        bw.write("BDD");
        bw.newLine();

        System.out.println("Finished!");
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        fileconcept fc = new fileconcept();
//        fc.prg1();
//        fc.filereader();
//        fc.filereader1();
        fc.filewrite();
    }
}
