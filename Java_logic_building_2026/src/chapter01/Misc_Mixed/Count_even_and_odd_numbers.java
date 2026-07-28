package chapter01.Misc_Mixed;

public class Count_even_and_odd_numbers {
	
	//Count even and odd numbers.
	public static void main(String[] args) {
		int[] arr = {7,4,10,20,34,46,56,54,68,76,4,3};
		
		int evennum=0;
		int oddnum=0;
		
		for(int val: arr) {
			if(val %2==0) {
			
				evennum++;
			
			}
			else {
				oddnum++;
				
				
			}
		}

		System.out.println("even number = "+evennum);
		System.out.println("odd number = "+oddnum);
	}

}
