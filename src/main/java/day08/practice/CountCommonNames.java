package day08.practice;

import java.util.HashMap;
import java.util.Map;

public class CountCommonNames {
  public static void main(String[] args) {
	  String [] names = {"Ram","Ram","Superman", "Spider", "Hey", "Hello","Hey", "Spider"};
	  
	  
	  
	  Map<String, Integer> countMap = new HashMap<String, Integer>();
	   
		for(int i=0; i<names.length; i++) {
			if(countMap.get(names[i])==null) {
				countMap.put(names[i],1);
				
			}
			else {
				int count = countMap.get(names[i]);
				count ++;
				countMap.put((names[i]),count);
				
			}
		}
		System.out.println(countMap);
}
}
