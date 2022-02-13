//Write a program to sort HashMap by keys 

import java.util.*;
public class Question_17 {
	
	static Map<String, Integer> list = new HashMap<>();
	public static void sorting() {
		TreeMap<String, Integer> sorted = new TreeMap<>(list);
		for(Map.Entry<String, Integer> entry : sorted.entrySet())
			System.out.println("Key : "+ entry.getKey()+" value: "+entry.getValue());
	}
	
public static void main(String args[]) {
	list.put("Csk", 1);
	list.put("Rcb", 3);
	list.put("Mi", 2);
	sorting();
	
}
}
