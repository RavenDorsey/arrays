package Day29;

public class SbPractice {
	public static void main(String[] args) {
		System.out.println(buildAlphabet());
		System.out.println("-----");
		
		String res = getNumberStrRange(1, 10);
		System.out.println(res);
		
		String res1 = getNumberStrRange(5, 15);
		System.out.println(res1);
	}
	
	// TODO refactor this code
	
	public static String buildAlphabet() {
		StringBuilder alphabet = new StringBuilder();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			alphabet.append(ch);
		}
	
			return alphabet.toString(); 
}
	public static String getNumberStrRange(int start, int end) {
		StringBuilder resNumberRange = new StringBuilder();
		for (int i = start; i <= end; i++) {
			resNumberRange.append(i);
		}
		return resNumberRange.toString();
	}
	
	}
