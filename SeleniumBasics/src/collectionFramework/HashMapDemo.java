package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> td = new HashMap<>();
		
		td.put("Ram", 123456789);
		td.put("Sham", 987654321);
		
		for (Map.Entry m:td.entrySet() ){
			
			System.out.println(m.getKey() + " - " + m.getValue());
		}
	}

}
