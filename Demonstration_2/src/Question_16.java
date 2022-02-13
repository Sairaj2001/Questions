//Write a program to iterate the HashMap

import java.util.*;
public class Question_16 {
	public static void main(String args[]) {
	Map<Character, String> table = new HashMap<Character, String>();
	table.put('J', "Java");
	table.put('P', "Python");
	table.put('S', "Spring");
	
	table.forEach((key, value) ->System.out.println(key+"="+value));
	}

}
