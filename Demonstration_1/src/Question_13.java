//Write a program to add elements to HashSet
import java.util.*;
public class Question_13 {
public static void main(String args[]) {
	Set<Integer> set = new HashSet<Integer>();
	set.add(1);
	set.add(2);
	set.add(3);
	
	System.out.println("Numbers are: "+ set);
	
	Scanner s =new Scanner(System.in);
	System.out.print("Enter a element if you want to add: ");
	int a = s.nextInt();
	set.add(a);
	System.out.println("Numbers are: "+ set);
	}
}

