//Write a program to remove element from specified index of ArrayList
import java.util.*;
public class Question_21 {
public static void main(String args[]) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Messi");
	list.add("Ronaldo");
	list.add("Ramos");
	list.add("Neymar");
	System.out.println("list is : "+ list);
	list.remove(3);
	System.out.println("updated list is : "+ list);
}
}
