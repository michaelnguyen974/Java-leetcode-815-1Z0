package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    private static final int MAX = 3;

    public static void main(String[] args) {
        App app = new App();
        int[] intArray = {5, 2};
        var solution = app.sortArray(intArray);
        System.out.println(solution);
        
    }

    public List<Integer> sortArray(int[] intArray) {
        int x;
        for (int i = 0; i < intArray.length; i++ ) {
            for (int j = 1; j < intArray.length - i; j++) {
                if (intArray[j-1] > intArray[j]) {
                    x = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = x;
                }
            }
        }
        List<Integer> sortedList = Arrays.stream(intArray).boxed().collect(Collectors.toList()); // converts intArray into a list of Integers
        System.out.println(sortedList); 
        return sortedList;
    }
}
