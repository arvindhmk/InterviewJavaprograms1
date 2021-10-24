package Programcollection.interviewquestions;

public class printwithoutsemicolon {
    public static void main(String[] args) {
        //type1
        if (System.out.printf("HELLO WORLD"+"\n") == null) {
        }
        //type2
        if (System.out.append("HELLO WORLD" + "\n") == null) {
        }
        //type3
  if(System.out.append("HELLO WORLD" + "\n").equals(null)) {
        }
  //type4
        for(int i=0;i<1;System.out.print("HELLO WORLD"))
        {
            i++;
        }
    }
}
