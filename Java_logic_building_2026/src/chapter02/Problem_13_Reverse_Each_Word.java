package chapter02;

public class Problem_13_Reverse_Each_Word {

	public static void main(String[] args) {
		String st = "hello pranav ghom";
		String rev_st="";
		String[] words = st.split(" ");
		 
		for(int i = 0; i<words.length; i++) {
			
			
			for(int j=words[i].length()-1;j>=0;j--) {
				char ch = words[i].charAt(j);
			
				rev_st= rev_st+ch;
				
			}
			rev_st =rev_st+" ";		
		}
		
		
		System.out.print(rev_st);
		
		
		

	}

}
