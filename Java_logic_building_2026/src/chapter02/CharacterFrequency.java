package chapter02;

public class CharacterFrequency {

	public static void main(String[] args) {
		String s = "programming";
		char target = 'g';
		int count =0;
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(target == ch) {
				count ++;
			}
			

	}
		System.out.println(" Frequency of 'g' is ="+count);
	}
}
