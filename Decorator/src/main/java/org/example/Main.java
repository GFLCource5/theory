package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        OddList oddList = new OddListImpl(list);

        System.out.println("Usual list first element:");
        System.out.println(list.get(0));
        System.out.println("Odd list first element:");
        System.out.println(oddList.get(0));

        System.out.println("Usual list second element:");
        System.out.println(list.get(1));
        System.out.println("Odd list second element:");
        System.out.println(oddList.get(1));

        System.out.println("Usual list size:");
        System.out.println(list.size());
        System.out.println("Odd list size:");
        System.out.println(oddList.size());
    }
}