package chapter02;

public class CountSpecialCharacters {

	public static void main(String[] args) {
		String s = "Java@123#Hello! ";
		int count =0;
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(!Character.isLetter(ch) && !Character.isDigit(ch) && ch!=' ') {
			 count ++;
			 
			}
		}
		System.out.println("Special Character is ="+count);
	}

}
