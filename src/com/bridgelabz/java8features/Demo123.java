package com.bridgelabz.java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo123
{

    public static void main(String[] args)
    {
        // Consumer => It represents an operation that accepts a single argument and returns no result.

        Consumer<Integer> consumer = (a) -> {
            System.out.println(a);
        };
        consumer.accept(1);

        // Predicate => It represents a predicate (boolean-valued function) of one argument.

        Predicate<Integer> predicate = t -> (t <= 5);
        System.out.println(predicate.test(10));

        // Function => It represents a function that accepts one argument and returns a result.(input and output)

        Function<Integer,String> function = t -> t + " Apple";
        System.out.println(function.apply(5));

        // Supplier => It represents a supplier of results.(NO input only supplier)
//        Supplier<Integer> supplier =
    }
}
