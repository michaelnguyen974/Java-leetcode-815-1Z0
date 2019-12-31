package org.example.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.example.leetcode.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void sortListWithTwoNumbers() {
       App app = new App();
	   int[] intArray = {5,2,3,1};
	   List solution = app.sortArray(intArray);
	   List<Integer> expected = List.of(1,2,3,5); // List.of is a factory method since Java 9
	   assertEquals(expected, solution);
    }

    // @Test
    // public void shouldAnswerWithTrue()
    // {
    //     assertEquals(true, false);
    // }
}
