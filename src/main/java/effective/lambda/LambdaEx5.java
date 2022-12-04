package main.java.effective.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {

    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100)+1;
        Consumer<Integer> c = i -> System.out.println(i + ", ");
        Predicate<Integer> p = i -> i%2 == 0;
       // Function<Integer, Integer> f = i -> i -> i / 10*10; // i의 일의 자리를 없앤다.

    }
}
