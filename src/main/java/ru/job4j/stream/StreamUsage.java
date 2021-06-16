package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUsage {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(-5);
        nums.add(6);
        nums.add(-1);
        List<Integer> positive = nums.stream().filter(
                num -> num > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
