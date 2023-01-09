package Day29;

import java.util.Arrays;

public class FirstLast {
	public static void main(String[] args) {
		String[] team = new String[4];
		team[0] = "Nets";
		team[1] = "Warriors";
		team[2] = "Lakers";
		team[3] = "Clippers";
		System.out.println(Arrays.toString(team));
		
		
		String[] teamTwo = new String[] {"Grizzlies", "Wizards", "Bulls", "Heat"};
		System.out.println(Arrays.toString(teamTwo));
		
		String[] teamThree = {"Bucks", "Pelicans", "Suns"};
		System.out.println(Arrays.toString(teamThree));
		
		
	// TODO array of double numbers with these values
		double[] number = {11.1, 22.2, 3.33, 4.44};
		System.out.println(Arrays.toString(number));
		// to get size of Array
		int arraySize = number.length;
		System.out.println("Array size: " + arraySize);
		
		
		// TOOD get sum of first and last element of array
		double firstLastSum = number[0] + number[number.length - 1];
		System.out.println("Sum of first and last elements: " + firstLastSum);
		
		
				
	}

}
