package day11.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTask {
  

	@Test
	public void testValidTask() throws DAOException {
		Task task1 = new Task("Learn java", "Compleated");
		Assertions.assertTrue(TaskDAO.createTask(task1));
	}

	@Test
	public void testInValidTask() {
		try {
			Task task1 = null;
			TaskDAO.createTask(task1);
		} catch (DAOException ex) {
			Assertions.assertEquals("Tasks object cannot be null", ex.getMessage());
		}

	}

}
