package Programcollection.interviewquestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamsjava
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(23);
        ar.add(3);
        ar.add(56);
        ar.add(223);
        ar.add(238);

        List<Integer> l = ar.stream().filter(i->i%2!=0).collect(Collectors.toList());
//        l.forEach(System.out::println);

        List<Integer> l2 = ar.stream().map(i->i-10).collect(Collectors.toList());
//        l2.forEach(System.out::println);

        List<Integer> l3 = ar.stream().sorted().collect(Collectors.toList());
//        l3.forEach(System.out::println);

        List<Integer> l4 = ar.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        l4.forEach(System.out::println);

//        List<Integer> l5 = ar.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        List<Integer> l5 = ar.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
//        l5.forEach(System.out::println);

        Integer sum = ar.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
