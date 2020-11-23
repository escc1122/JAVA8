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
        String b = String.join(",",a.stream().map(String::valueOf).collect(Collectors.toList()));

        System.out.println(b);

        String result2 =  a.stream().map(x -> x.toString()).collect(Collectors.joining(","));
        System.out.println(result2);

    }
}
