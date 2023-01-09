package Day29;

import java.util.Arrays;

public class Fruit {
	public static void main(String[] args) {
		// int[] score = new int[5];
		String[] fruit = new String[4];
		// null, null, null, null
		// then we assign value
		fruit[0] = "orange";
		fruit[1] = "kiwi";
		fruit[2] = "banana";
		fruit[3] = "apple";
		
		String str = fruit[2];
		System.out.println(str); //banana
		
		//TODO
		// reassign element under index 3 with "cherries" value
		fruit[3] = "cherries";
		
		// to find the array package
		String arrayAsString = Arrays.toString(fruit);
		System.out.println(arrayAsString);
		// must import array package
		
		
		
		
	}

}
