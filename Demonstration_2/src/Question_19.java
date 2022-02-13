//Write a program to sort ArrayList in descending order

import java.util.*;
public class Question_19 {
public static void main(String args[]) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Virat");
	list.add("Dhoni");
	list.add("Sachin");
	list.add("Kapil");
	list.add("Srikant");
	System.out.println("List: "+ list);
	Collections.sort(list, Collections.reverseOrder());
	System.out.println("Sorted array in descending order: "+ list);
}
}
