package chapter02;

public class Consonants {

	public static void main(String[] args) {
		String s ="progrZamming";
		String consonants = "bcdfghjklmnpqrstvwxyz";
		int count =0;
		
		for(int i =0;i<s.length();i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			//System.out.println(ch);
			if(consonants.contains(String.valueOf(ch))) {
				count++;
			
			}
		}
 System.out.println("consonent = "+count);
	}

}
