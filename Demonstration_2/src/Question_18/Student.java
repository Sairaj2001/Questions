package Question_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {

	int sRoll;
	String sName;
	int sMark;
	
	Student(int sRoll, String sName, int sMark){
		this.sRoll = sRoll;
		this.sName = sName;
		this.sMark = sMark;
	}
	
	class nameComparator implements Comparator<Student>{
		public int compare(Student s1, Student s2) {
			return s1.sName.compareTo(s2.sName);
		}
	}
	class Main{
		public static void main(String args[]) {
			ArrayList<Student> s = new ArrayList<Student>();
			s.add(new Student(1,"Sairaj",90));
			s.add(new Student(2,"Barsha",99));
			s.add(new Student(3,"Srikant",100));
		//	Collections.sort(s, new nameComparator());
			for(Student student : s) {
				System.out.println("Student Name :"+ student.sName + " Student rollno: " + student.sRoll + "Student mark: " + student.sMark);
			}
		}
	}
}
