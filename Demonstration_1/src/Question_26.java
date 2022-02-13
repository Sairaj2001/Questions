//Write a program to sort HashMap by value
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
public class Question_26 {
	public static HashMap<String, Integer>sortByValue(HashMap<String, Integer>hm){
		 HashMap<String, Integer> temp
         = hm.entrySet()
               .stream()
               .sorted((i1, i2)
                           -> i1.getValue().compareTo(
                               i2.getValue()))
               .collect(Collectors.toMap(
                   Map.Entry::getKey,
                   Map.Entry::getValue,
                   (e1, e2) -> e1, LinkedHashMap::new));
		return temp;
				                                
	}
public static void main(String args[]) {
	HashMap<String,Integer> hm = new HashMap<>();
	hm.put("Math", 96);
	hm.put("English", 80);
	hm.put("Science", 74);
	hm.put("SSC", 84);
	Map<String,Integer> hm1 = sortByValue(hm);
	for(Map.Entry<String,Integer> entr : hm1.entrySet())
		System.out.println("Key = "+entr.getKey()+"Value= "+entr.getValue());
	
}
}
