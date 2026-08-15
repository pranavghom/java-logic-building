package chapter02;

public class CountDigits {

	public static void main(String[] args) {
		String s = "java123hello45";
		int count =0;
		
		for(int i =0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				count ++;
			}
		}
		System.out.println("Digis="+count);
	}

}
