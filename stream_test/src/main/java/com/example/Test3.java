package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("A","B","C","D");
        String result=  list.stream().collect(Collectors.joining("-"));
        System.out.println(result);
        String result2 =  list.stream().collect(Collectors.joining("-","[","]"));
        System.out.println(result2);
    }
}
