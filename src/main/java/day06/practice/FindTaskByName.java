package day06.practice;

import java.util.ArrayList;


class Task1 {
	
	 private String name;
	 
	    public Task1(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return name;
	    }
}



public class FindTaskByName {
   public static void main(String[] args) {
	   ArrayList<Task1> tasks = new ArrayList<>();
       tasks.add(new Task1("wakeUp"));
       tasks.add(new Task1("Exercise"));
       tasks.add(new Task1("Cleaning"));
       boolean find = findTaskByName("Exercise", tasks);
       System.out.println("Task Status : " + find);
   }
   public static  boolean findTaskByName(String name, ArrayList<Task1> tasks) {
       for (Task1 task : tasks) {
           if (task.getName().equals(name)) {
               return true;
           }
       }
       return false;
}
}
