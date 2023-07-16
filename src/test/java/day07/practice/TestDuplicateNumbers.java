package day07.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDuplicateNumbers {

	@Test
	public void testValidArray() {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		numbers.add(4);
		numbers.add(5);
		numbers.add(7);
		numbers.add(7);

		HashSet<Integer> uniqueArray = new HashSet<Integer>(Arrays.asList(2, 4, 5, 7));
		try {
			DuplicateNumbers.removeDuplicate(numbers);
			boolean valid = DuplicateNumbers.validateDuplicatemethod(numbers, uniqueArray);
			Assertions.assertTrue(valid);
			Assertions.fail("Validatepriority failed");
		} catch (Exception ex) {
			Assertions.assertEquals("The array does not took all unique elements.", ex.getMessage());
		}

	}

	@Test
	public void testInValidArray() {

		try {
			DuplicateNumbers.removeDuplicate(null);
			Assertions.fail("Validatepriority failed");
		} catch (Exception ex) {
			Assertions.assertEquals("Array cannot be null", ex.getMessage());
		}

	}
}
