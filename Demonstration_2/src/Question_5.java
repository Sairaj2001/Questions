//Given an element write a program to check if element exists in HashSet?
import java.util.*;
public class Question_5 {
 public static void main(String args[]) {
	 Scanner s = new Scanner(System.in);
	 HashSet<String> h = new HashSet<String>();
	 h.add("Sai");
	 h.add("Sumit");
	 h.add("Yug");
	 h.add("Golu");
	
	 System.out.println("Enter the name: ");
	 String name = s.next();
	 if(h.contains(name)) {
		 System.out.println(name + " is in the list");
	 }else
		 System.out.println(name + " is not in the list");
 }
}
