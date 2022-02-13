//Write a program to add elements to the HashMap given the key and value data type is String
import java.util.*;
public class Question_10 {
	public static void main(String args[]) {
		HashMap<String, String> a = new HashMap<>();
		a.put( "Sai", "India");
		a.put( "Sumit", "India");
		a.put( "Yug", "India");
		a.put( "Golu", "India");
		System.out.println("List is :"+a);
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String b= s.next();
		System.out.print("Enter the country: ");
		String c = s.next();
			if(c == a.get(b)) {
				System.out.println("okkk");
			}else
				a.replace(b, c);
			System.out.println("All informations  :" + a);
		
	}

}
