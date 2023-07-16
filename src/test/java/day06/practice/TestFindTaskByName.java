package day06.practice;

import java.util.ArrayList;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFindTaskByName {
	@Test
	public void testValidFindTask() throws Exception {

		ArrayList<Task1> tasks = new ArrayList<>();
	       tasks.add(new Task1("wakeUp"));
	       tasks.add(new Task1("Exercise"));
	       tasks.add(new Task1("Cleaning"));

		boolean findTask = FindTaskByName.findTaskName("Exercise", tasks);

		Assertions.assertTrue(findTask);

	}

	@Test
	public void testInValidFindTask() {

		try {
			ArrayList<Task1> tasks = new ArrayList<>();
		       tasks.add(new Task1("wakeUp"));
		       tasks.add(new Task1("Exercise"));
		       tasks.add(new Task1("Cleaning"));

			boolean findTask = FindTaskByName.findTaskName("House Cleaning", tasks);

			Assertions.fail("testInValidFindTask failed");
		} catch (Exception ex) {
			Assertions.assertEquals("Task Not found", ex.getMessage());
		}

	}
}
