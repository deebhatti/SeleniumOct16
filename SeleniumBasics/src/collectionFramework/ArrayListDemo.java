package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Paris");
		cities.add("Chennai");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Hyderabad");
		cities.add("Paris");
		
		
		for (String t : cities){
			System.out.println(t);
		}
		
		
		int number = cities.size();
		System.out.println("Number of links = " + number);
	}

}
