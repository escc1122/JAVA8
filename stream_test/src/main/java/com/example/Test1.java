package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args){
//        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());


        squaresList.forEach(n-> System.out.println(n));

        squaresList.forEach(System.out::println);

    }
}
