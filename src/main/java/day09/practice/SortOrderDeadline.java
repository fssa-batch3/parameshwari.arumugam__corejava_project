package day09.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Task implements Comparable<Task> {

	int id;
	String name;
	LocalDate deadline;

	Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;

	}

	@Override
	public int compareTo(Task o) {
		return deadline.compareTo(o.deadline);
	}
}

public class SortOrderDeadline {
	public static void main(String[] args) {

		ArrayList<Task> tasks = new ArrayList<Task>();

		tasks.add(new Task(3, "Coding", LocalDate.parse("2022-10-22", DateTimeFormatter.ISO_DATE)));
		tasks.add(new Task(5, "Product Design", LocalDate.parse("2022-10-01", DateTimeFormatter.ISO_DATE)));
		tasks.add(new Task(1, "Software Design", LocalDate.parse("2022-10-07", DateTimeFormatter.ISO_DATE)));
		tasks.add(new Task(3, "Coding", LocalDate.parse("2022-10-22", DateTimeFormatter.ISO_DATE)));

		System.out.println("Sorting by deadline");

		Collections.sort(tasks);
		Iterator<Task> itr2 = tasks.iterator();
		while (itr2.hasNext()) {
			Task st = itr2.next();
			System.out.println(st.id + " " + st.name + " " + st.deadline);
		}

	}

}
