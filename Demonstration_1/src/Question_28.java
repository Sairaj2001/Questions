//How to synchronize a HashMap in java
import java.util.*;
public class Question_28 {
public static void main(String args[]) {
	HashMap<Integer, String> hmap = new HashMap<>();
	hmap.put(1, "India");
	hmap.put(2, "England");
	hmap.put(3, "USA");
	System.out.println("hash map is : +"+hmap);
	Map<Integer, String> sMap = Collections.synchronizedMap(hmap);
	System.out.println("Synchronized map is:"+ sMap);
}
}
