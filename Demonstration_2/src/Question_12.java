// Write a program to add elements to ArrayList ?
import java.util.*;
public class Question_12 {
public static void main(String args[]) {
	ArrayList<String> s = new ArrayList<>();
	s.add("BirlaSoft");
	s.add("TCS");
	s.add("MICROSOFT");
	System.out.println("Some Top rated companies are: "+ s);
	Scanner a = new Scanner(System.in);
	System.out.print("Enter a new company name: ");
	String name = a.next();
	if(s.contains(name)) {
		System.out.println("This company already in the list");
	}else {
		s.add(name);
		System.out.println("Updated list is : "+ s);
	}
}
}
