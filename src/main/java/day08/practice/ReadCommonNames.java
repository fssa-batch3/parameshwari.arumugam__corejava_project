package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReadCommonNames {
   public static void main(String[] args) {
		
	   Scanner sc=new Scanner(System.in);
	   Map<String, List<String>> employees = new HashMap<>();


	   for(int i=0;i<5;i++) {
	   	System.out.println("Enter Employee Name and Department Name");
	   	String str=sc.nextLine();
	   	if(str==null || "".equals(str)) {
	   		
	   		throw new IllegalArgumentException("Input cant't be Empty or Null");
	   	}
	   	
	   	String [] arrstr=str.split(",");
	   	
	   	if(arrstr.length<2 || arrstr.length>2 ) {
	   		throw new IllegalArgumentException("Input Must have department name and employee name");
	   	}
	   	
	   	if(employees.get(arrstr[0])==null) {
	   		employees.put(arrstr[0], new ArrayList<>());
	   		employees.get(arrstr[0]).add(arrstr[1]);
	   	}
	   	else {
	   		employees.get(arrstr[0]).add(arrstr[1]);
	   	}
	   	
	   }
	   System.out.println(employees);

}
}
