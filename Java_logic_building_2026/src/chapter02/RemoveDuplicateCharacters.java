package chapter02;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String s = "programming";
		String result ="";
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(!result.contains(String.valueOf(ch))) {
				//System.out.println("true"+ch);
				result=result+ch;
			}
		
			
		}
		
		System.out.println("Result = "+result);
	}

}
