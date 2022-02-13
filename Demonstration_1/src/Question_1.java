// Write a program to traverse (or iterate) ArrayList?

import java.util.ArrayList;
public class Question_1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Cricket");
		list.add("Hockey");
		list.add("Football");
		list.add("Golf");
		System.out.println("Most Popular games are: " + list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			System.out.print(", ");
		}
		
	}

}
