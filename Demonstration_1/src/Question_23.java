//Write a program to convert HashSet to Array

import java.util.*;
public class Question_23 {

	public static void main(String[] args) {
		HashSet<String> list = new HashSet<>();
		list.add("right");
		list.add("left");
		list.add("up");
		list.add("down");
		System.out.println("Hashset is: "+ list);
		String arr[] = new String[list.size()];
		list.toArray(arr);
		for(String s : arr) {
			System.out.println(s);
		}
		

	}

}
