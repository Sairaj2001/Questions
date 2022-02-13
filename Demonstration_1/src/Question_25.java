// Write a program to iterate TreeMap in java
import java.util.*;
import java.util.Map.Entry;
public class Question_25 {
public static void main(String args[]) {
	Map<String, String> map = new TreeMap<String, String>();
	map.put("Ram", "Sita");
	map.put("Krishna", "Radha");
	map.put("Jagannath", "Laxmi");
	for(Map.Entry<String, String> entry : map.entrySet())
		System.out.println("["+entry.getKey()+"<->"+entry.getValue()+"]");
	
	
}
}
