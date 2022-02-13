//Write a program to add element at particular index of ArrayList

import java.util.*;
public class Question_20 {
public static void main(String args[]) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Cisco");
	list.add("TATA");
	list.add("Google");
	list.add("Microsoft");
	System.out.println("List is: " + list);
	list.add(2, "Birla");
	System.out.println("Updated list  is: "+ list);
}
}
