package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        String result1 = String.join(",",a.stream().map(String::valueOf).collect(Collectors.toList()));

        System.out.println("result1 => " + result1);

        String result2 =  a.stream().map(x -> x.toString()).collect(Collectors.joining(","));
        System.out.println("result2 => " + result2);


        String result3 =  a.stream().filter(x -> x< 3).map(x -> x.toString()).collect(Collectors.joining(","));
        System.out.println("result3 => " + result3);

//        result1 => 1,2,3,4,5,6
//        result2 => 1,2,3,4,5,6
//        result3 => 1,2

    }
}
