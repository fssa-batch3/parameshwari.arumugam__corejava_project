package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortIntegers {
	 public static void main(String[] args) {
	        
		 Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number : ");
			
			int n = sc.nextInt();
			
			ArrayList<Integer> numSort = new ArrayList<Integer>();
		
			System.out.println("Enter " + n + " Numbers : ");
		        for (int i = 0; i <n; i++) {
		            int num = sc.nextInt();
		            numSort.add(num);
		            Collections.sort(numSort);
		        }
		
			System.out.println(numSort);
			sc.close();

	    }
}
