package day08.misc;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
   public static void main(String[] args) {
	
	   String [] arrnames = {"prathi", "nares" , "prathi" ,
			   
	    "nithilan" , "prathi" , "vishali" , "vishali", " vishali" };
	   
	   Map<String, Integer> countMap = new HashMap<String, Integer>();
	   
	for(int i=0; i<arrnames.length; i++) {
		if(countMap.get(arrnames[i])==null) {
			countMap.put(arrnames[i],1);
			
		}
		else {
			int count = countMap.get(arrnames[i]);
			count ++;
			countMap.put((arrnames[i]),count);
			
		}
	}
	System.out.println(countMap);

}
}
