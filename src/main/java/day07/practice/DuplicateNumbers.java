package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateNumbers {
   public static void main(String[] args)  throws Exception  {
	   
	    ArrayList<Integer> number = new ArrayList<Integer>();
	    number.add(1);
	    number.add(2);
	    number.add(1);
	    number.add(4);
	    number.add(5);
	    removeDuplicate(number);

	}

	public static void removeDuplicate(ArrayList<Integer> numbers) throws Exception {
		if (numbers == null) {
			throw new Exception("Array cannot be null");
		}

		HashSet<Integer> newArray = new HashSet<Integer>(numbers);

		System.out.println("remove duplicates");
		for (Integer element : newArray) {
			System.out.print(element);

		}

	}

	public static boolean validateDuplicatemethod(ArrayList<Integer> numbers, HashSet<Integer> numbers2)
			throws Exception {
		HashSet<Integer> set = new HashSet<>(numbers);

		if (!set.equals(numbers2)) {
			throw new Exception("The array does not took all unique elements.");

		}
		return true;

   	}
}

