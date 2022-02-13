//How to serialize a HashMap in java
import java.io.*;
import java.io.FileOutputStream;
import java.util.*;
public class Question_27 {

	public static void main(String[] args) {
	HashMap<String,String> map = new HashMap<>();
	map.put("Virat", "Cricket");
	map.put("Messi", "Football");
	map.put("Mandeep", "Hockey");
	try {
		FileOutputStream myFileOutput = new FileOutputStream("F:/NewHashMap/new.txt");
		ObjectOutputStream myObject = new ObjectOutputStream(myFileOutput);
		myObject.writeObject(map);
		myObject.close();
		myFileOutput.close();
	}catch(IOException e) {
		e.printStackTrace();
	}

	}

}
