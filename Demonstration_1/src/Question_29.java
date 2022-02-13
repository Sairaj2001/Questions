// How to serialize an ArrayList in java
import java.io.*;
import java.io.IOException;
import java.util.*;
public class Question_29 {

	public static void serializeArray() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Modi");
		list.add("Biden");
		list.add("Boris");
		try {
		FileOutputStream fos = new FileOutputStream("listData");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
		fos.close();
		System.out.println("Name list serialized");
	}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	public static void main(String[] args) {
		serializeArray(); 	

	}

}
