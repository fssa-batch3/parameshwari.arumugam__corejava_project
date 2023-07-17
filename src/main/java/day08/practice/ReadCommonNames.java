package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadCommonNames {
   public static void main(String[] args) {
	   HashMap<String, List<String>> departmentEmployeeMap = new HashMap<>();
       String input = "HR,Ram\n" + "HR,Suresh\n" + "IT,Basker\n" +"IT,Joseph\n" + "Admin,Sundar";

       String[] lines = input.split("\n"); 
       for (String line : lines) {
           String[] parts = line.split(",");
           String deptName = parts[0].trim();
           String EmployeeName  = parts[1].trim();

           if (departmentEmployeeMap.containsKey(deptName)) {
             
               departmentEmployeeMap.get(deptName).add(EmployeeName );
           } else {
              
               List<String> employees = new ArrayList<>();
               employees.add(EmployeeName );
               departmentEmployeeMap.put(deptName, employees);
           }
       }

   
       for (Map.Entry<String, List<String>> entry : departmentEmployeeMap.entrySet()) {
           String deptName = entry.getKey();
           List<String> employees = entry.getValue();
           System.out.println(deptName + ", " + employees);
       }

}
}
