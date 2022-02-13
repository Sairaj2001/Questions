// Write a program to sort ArrayList using Comparable and Comparator? 

package Question_18;
import java.util.*;
public class SortEX {

	public static void main(String[] args) {
		ArrayList<address> list = new ArrayList<>();
		list.add(new address(63,"Digapahandi","India"));
		list.add(new address(44,"Mumbai", "India"));
		list.add(new address(55, "NewYork", "USA"));
		
		Collections.sort(list);
		for(address add: list) {
			System.out.println(add);
		}
		
		

	}

}
