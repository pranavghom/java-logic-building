package chapter02;

public class CountVowels {

	public static void main(String[] args) {
		String s = "programing java";
		String vowels = "aeiou";
		int count =0;
		
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(vowels.contains(String.valueOf(ch))) {
				count ++;
				
			}
			
			
		}
		System.out.println("vowels="+count);
	}

}
