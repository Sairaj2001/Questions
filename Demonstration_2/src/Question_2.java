 //Write a program to convert List to Array.

import java.util.*;
public class Question_2 {
 public static void main(String args[]) {
	 List<String> list = new LinkedList<String>();
	 list.add("I");
	 list.add("love");
	 list.add("to");
	 list.add("play");
	 list.add("cricket");
	 
	 String[] arr = list.toArray(new String[0]);
	 for(String x : arr) {
		 System.out.print(x + " ");
	 }
	 
 }
}
