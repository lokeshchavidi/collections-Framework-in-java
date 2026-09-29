package colllections;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		// creating a list 
		List<String> list1 = new ArrayList<>();
		
		//add method
		list1.add("Lokesh");
		list1.add(null);
		list1.add("murali");
		System.out.println("Add Method Output: "+list1);
		
		//Add based On index
		list1.add(1, "Kiran");
		System.out.println("After adding based On index: "+list1);
		
		//get Method Based On Index
		System.out.println("Element at index 02: "+list1.get(2));
		
		// set method (index,element)
		list1.set(2, "Rahul");
		System.out.println("Set method based On index: "+list1);
		
		// add duplicates
		list1.add("Lokesh");
		System.out.println("After adding duplicates: "+list1);
		
		//contains (it will not support ignorecase
		System.out.println("Murali is there in list: "+list1.contains("Murali"));
//		for(String name: list1) {
//			if(name.equalsIgnoreCase("mura")) {
//				System.out.println("Found");
//				break;
//			}
//		}
		
		//indexof
        System.out.println("First index of Ravi: " + list1.indexOf("murali"));
        //lastindexof
        System.out.println("last index of method"+list1.lastIndexOf("Lokesh"));
        System.out.println(list1.size());
	}
}
