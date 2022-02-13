//Write a program to convert LinkedList to ArrayList
import java.util.*;
public class Question_22 {
public static void main(String args[]) {
	LinkedList<String> list = new LinkedList<>();
	list.add("Mango");
	list.add("Coconut");
	list.add("Banana");
	list.add("Apple");
	List<String> list1 = new ArrayList<String>(list);
	for(String str : list1) {
		System.out.println(str);
	}
}
}
