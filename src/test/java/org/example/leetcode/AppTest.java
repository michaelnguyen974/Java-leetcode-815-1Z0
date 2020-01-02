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
	   int[] intArray = {5,2};
	   List<Integer> solution = app.sortArray(intArray);
	   List<Integer> expected = List.of(2,5); // List.of is a factory method since Java 9
	   assertEquals(expected, solution);
	}

	@Test
	public void sortListWithThreeNumbers() {
		App app = new App();
		int[] intArray = {5,2,3};
		List<Integer> solution = app.sortArray(intArray);
		List<Integer> expected = List.of(2,3,5);
		assertEquals(expected, solution);
	}
}
