package collectionFramework;

import java.util.LinkedList;

public class LinkeListDemo {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("Paris");
		cities.add("Chennai");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Hyderabad");
		
		
		for (String t : cities){
			System.out.println(t);
		}
		
		
		int number = cities.size();
		System.out.println("Number of links = " + number);
	}
	
	}


