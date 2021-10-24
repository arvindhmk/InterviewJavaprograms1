package Programcollection.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeduplicateelementsfromarraylist
{



    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,6,6,6,7,8,9,9,9));
//
//        LinkedHashSet<Integer> linknumber = new LinkedHashSet<Integer>(numbers);
//
//        ArrayList<Integer> numbers2 = new ArrayList<Integer>(linknumber);
//
//        System.out.println(numbers2);

        List<Integer> distinctvaluues = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctvaluues);

        ArrayList<Integer> clonednumbers = (ArrayList<Integer>)numbers.clone();
        System.out.println(clonednumbers);
//Removeif method

        clonednumbers.removeIf(clonednumbers1 -> clonednumbers1%2 != 0);
        System.out.println(clonednumbers);
    }
}
