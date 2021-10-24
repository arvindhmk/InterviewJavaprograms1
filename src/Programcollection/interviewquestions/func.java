package Programcollection.interviewquestions;

import java.util.function.Consumer;
import java.util.function.Function;

public class func
{
    public static void main(String[] args)
    {
        Function<Double,Double> f1=i->Math.pow(i,i);
        Function<Double,Double> f2=i->i+2;


        System.out.println(f1.andThen(f2).apply(1.0));
        System.out.println(f1.compose(f2).apply(1.0));

        Consumer<Double> f3 = i-> System.out.println(i);
        f3.accept(45.0);

    }
}
