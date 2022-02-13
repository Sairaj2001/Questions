//How to synchronize an ArrayList in java
import java.util.*;
public class Question_30 {
public static void main(String args[]) {
	ArrayList<String> list = new ArrayList<>();
	list.add("RR");
	list.add("Audi");
	list.add("Maruti");
	
	synchronized(list){
	Iterator it = list.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	}
	
	
}
}
