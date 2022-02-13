//Write a program to convert Array to List
import java.util.*;
import java.util.stream.Collectors;
public class Question_8 {
	public static <t> List<t> convertArrayToList(t array[]){
		return Arrays.stream(array).collect(Collectors.toList());
	}
	
 public static void main(String args[]) {
	String[]array= {"Dog","Cat","Horse","Lion" };
	System.out.println("Animals : "+ Arrays.toString(array));
	List<String> list = convertArrayToList(array);
	System.out.println("list : "+list);
 }
}
