package org.example.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public List<Integer> sortArray(int[] intArray) {
        List<Integer> list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        return list;
    }
}
