package Day29;

import java.util.Arrays;

public class Price {
	public static void main(String[] args) {
		// TODO create array of type double with size 3
		double[] price = new double[3];
		price[0] = 14.99;
		price[1] = 9.99;
		price[2] = 1.5;
		
		
		// Arrays is helper class for array. It has many useful methods
		//one of them is toString(array) to get array as String
		// we can use it to print array values in one line
		System.out.println(Arrays.toString(price));
		
		//TODO get total sum of elements (without loop)
		double sum = price[0] + price[1] + price[2];
		System.out.println(sum);
		
	
	
	}

}
