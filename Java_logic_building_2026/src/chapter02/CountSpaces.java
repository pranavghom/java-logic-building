package chapter02;

public class CountSpaces {

	public static void main(String[] args) {
		String s = "Java is very easy";
		int count=0;
		   for(int i = s.length()-1; i>=0;i--) {
			   char ch =s.charAt(i);
			   if(ch == ' ') {
				   count++;
				   
			   }
		   }
		   System.out.println("Spaces = "+count);
	}

}
