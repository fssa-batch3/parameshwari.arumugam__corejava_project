package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


class Task {
	 int id;
	 String name;
	 LocalDate deadline;
	
	    
	    public Task(int id, String name, LocalDate deadline) {
	        this.id = id;
	        this.name = name;
	        this.deadline = deadline;
	    }
	    
	    public int getId() {
	        return id;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public LocalDate getDeadline() {
	        return deadline;
	    }
	    
	    
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Task task2 = (Task) obj;
	        return id == task2.id && name.equals(task2.name) && deadline.equals(task2.deadline);
	    }
	    
	    
	    public int hashCode() {
	        return id;
	    }
}

public class RemoveDuplicateTask {
   public static void main(String[] args) {
	   
	   ArrayList<Task> newTask = new ArrayList<>();
       
	   newTask.add(new Task(1, "Task 1", LocalDate.of(2023, 7, 15)));
	   newTask.add(new Task(2, "Task 2", LocalDate.of(2023, 7, 16)));
	   newTask.add(new Task(3, "Task 3", LocalDate.of(2023, 7, 17)));
	   newTask.add(new Task(4, "Task 4", LocalDate.of(2023, 7, 15))); 
       newTask.add(new Task(5, "Task 2", LocalDate.of(2023, 7, 16))); 
       
       System.out.println("Tasks with duplication:");
       
       for (Task task : newTask) {
           System.out.println(task.getId() + " - " + task.getName() + " - " + task.getDeadline());
       }
       
       HashSet<Task> uniqueTasks = new HashSet<>(newTask);
       
       System.out.println("\nTasks without duplication:");
       
       for (Task task : uniqueTasks) {
           System.out.println(task.getId() + " - " + task.getName() + " - " + task.getDeadline());
       }
	   
  }
}
