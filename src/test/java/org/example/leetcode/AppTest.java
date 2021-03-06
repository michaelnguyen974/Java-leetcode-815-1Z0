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
	   int[] intArray = {2,1};
	   List<Integer> solution = app.sortArray(intArray);
	   List<Integer> expected = List.of(1,2); // List.of is a factory method since Java 9
	   assertEquals(expected, solution);
	}

	@Test
	public void sortListWithThreeNumbers() {
		App app = new App();
		int[] intArray = {9,1,3};
		List<Integer> solution = app.sortArray(intArray);
		List<Integer> expected = List.of(1,3,9);
		assertEquals(expected, solution);
	}

	@Test
	public void sortListWithFourNumbers() {
		App app = new App();
		int[] intArray = {5,2,3,1};
		List<Integer> solution = app.sortArray(intArray);
		List<Integer> expected = List.of(1,2,3,5);
		assertEquals(expected, solution);
	}

	@Test
	public void sortListWithTwoIdenticalNumbers() {
		App app = new App();
		int[] intArray = {5,1,1,2,0,0};
		List<Integer> solution = app.sortArray(intArray);
		List<Integer> expected = List.of(0,0,1,1,2,5);
		assertEquals(expected, solution);
	}
}
