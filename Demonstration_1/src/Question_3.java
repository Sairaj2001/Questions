//Write a program to traverse(or iterate) HashSet?

import java.util.*;
public class Question_3 {
 public static void main(String args[]) {
	 HashSet<String> s = new HashSet<>();
	 s.add("Ram");
	 s.add("Jagannath");
	 s.add("Krishna");
	 s.add("Ram");
  
	 s.forEach(i -> System.out.println(i));
 }
}
