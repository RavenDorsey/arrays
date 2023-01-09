package Day29;

public class Temperature {
	public static void main(String[] args) {
		double[] temp = {32.1, 30, 25.7,25, 34, 31.5, 29};
		
		// TODO find out sum of element in the temp array
		double totalSum = 0.0;
		// TODO find out average temp
		// totalSum/array size
		 for(int i = 0; i < temp.length; i++) {
			 totalSum += temp[i];
		 }
		
		
		
		// TODO find out average temp
		// totalSum / arraySize
		
		double averageTemp = totalSum / temp.length;
		
		System.out.println("Total sum: " + totalSum);
		System.out.println("Average temperaature: " + averageTemp);
	}

}
