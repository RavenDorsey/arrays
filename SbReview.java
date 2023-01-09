package Day29;

public class SbReview {
	public static void main(String[] args) {
		// Whats the difference between a String and StringBuilder?
		// - String is immutable and StringBuilder is mutable object
		// - Every change of String requires new object so if we have code
		// that as many string changes it is better to use StringBuilder
		
		StringBuilder sb = new StringBuilder("A");
		sb.append("B");
		sb.append("C");
		System.out.println(sb);
		System.out.println("Size: " + sb.length());
		
		// insert(index, value)
		sb.insert(0, "X");
		System.out.println(sb);  //XABC
		
		sb.insert(2, "O");
		System.out.println(sb);

		
		// delete(Start, end)
		sb.delete(2, 4);
		System.out.println(sb); // XAC
		
		
		
	}

}
