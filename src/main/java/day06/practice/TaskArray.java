package day06.practice;

import java.util.ArrayList;

class Task {
	 
    public String taskName;
     
    public int priority;
    
    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }
}

public class TaskArray {
   public static void main(String[] args) {
	   
	   ArrayList<Task> TaskList = new ArrayList<>();
	   TaskList.add(new Task("Wake Up", 6));
	   TaskList.add(new Task("Exercise", 3));
	   TaskList.add(new Task("Cleaning", 5));
      
       for (Task task : TaskList) {
           System.out.println("Task Name: " + task.taskName);
           System.out.println("Priority: " + task.priority);
        }
     }
}
