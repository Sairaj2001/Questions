//Given an element write a program to check if element(value) exists in ArrayList?
import java.util.*;
public class Question_4 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(3);
		System.out.print("Enter a Integer form 1 to 10 : ");
		int i= s.nextInt();
		if(list.contains(i)) {
			System.out.println(i + " is present in the ArrayList...");
		}else {
			System.out.println(i + " is not present in the ArrayList..");
		}
	}

}
