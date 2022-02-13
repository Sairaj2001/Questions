// How to check if HashMap is empty
import java.util.*;
public class Question_15 {
public static void main(String args[]) {
	HashMap<Integer, String> list = new HashMap<>();
	list.put(1, "a");
	System.out.println("Is the HashMap is empty ? "+ list.isEmpty());
}
}
