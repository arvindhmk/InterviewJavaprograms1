package Programcollection.interviewquestions;

import java.io.*;

public class fileprogram1
{
    public static void main(String args[]) {
        File f1 = new File("E:\\sample.pdf");
        File f1cpy = new File("E:\\samplecopy.pdf");

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(f1);
            fos = new FileOutputStream(f1cpy);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(fis.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
            int i=0;
            try {
                while (!((i = fis.read()) != -1)) {
                    fos.write(i);
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
             finally {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

