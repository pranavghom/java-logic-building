package chapter02;

public class CountUppercaseLowercase {

	public static void main(String[] args) {
		String s = "Java PROGRAMMING";
		int lowerCase=0;
		int upperCase=0;
		for(int i = 0; i < s.length(); i++) {
			   char ch =s.charAt(i);
			   if(Character.isUpperCase(ch)) {
				   upperCase++;
				   
			   }
			   else if (Character.isLowerCase(ch)) {
				   lowerCase++;
				   }
		   }
System.out.println("lowerCase count is = "+lowerCase);
System.out.println("upperCase count is = "+upperCase);
	}

}
