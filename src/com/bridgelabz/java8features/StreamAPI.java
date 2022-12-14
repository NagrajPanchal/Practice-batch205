package com.bridgelabz.java8features;

// Stream API => Whenever we want to do some operations on group of data (array , Collection), we will use stream API.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(300);
        list.add(400);
        list.add(300);
        list.add(500);
        list.add(600);

        Consumer<Integer> ref1 = (x) -> System.out.println(x);
        list.stream().forEach(ref1);
        System.out.println("**** Consumer ****");
        list.stream().forEach((x) -> System.out.println(x));

        System.out.println("**** Predicate ****");
        Predicate<Integer> ref2 = (x) -> x%3 == 0;
        list.stream().filter(ref2).forEach(ref1);
        System.out.println("***********");
        list.stream().filter((x) -> x%3 == 0).forEach((x) -> System.out.println(x));
        System.out.println("****** filteredList *****");
        List<Integer> filteredList = list.stream().filter((x) -> x%3 == 0).toList();
        System.out.println(filteredList);

        System.out.println("**** Function ****");
        Function<Integer, Integer> ref3 = (x) -> x*5;
        List<Integer> mappedList = list.stream().map(ref3).toList();
        System.out.println(mappedList);
        System.out.println("****** filteredList with Function *****");
        List<Integer> finalList = list.stream().filter(ref2).map(ref3).toList();
        System.out.println(finalList);
        System.out.println("****** filteredList with examples *****");
        List<Integer> findList = list.stream().filter((x)->x%3 == 0).map((y) -> y+y).toList();
        System.out.println(findList);
        System.out.println("****** filteredList with examples1 *****");
        int findlists = findList.get(1);
        System.out.println(findlists);

        System.out.println("********* Reduce ********");
        Integer reduceFn = list.stream().reduce(0,(a,b) -> {
            return a+b;
        });
        System.out.println(reduceFn);




// Performs a reduction on the elements of this stream, using an associative accumulation function, and returns an Optional describing the reduced value,
    }
}
