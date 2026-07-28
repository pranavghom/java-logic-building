package chapter01.Misc_Mixed;

public class Smallest_element {

	
		public static void main(String[] args) {
			
			
			
			int[] arr = {121,10,20,34,45,54,54,67,76,4,3};
			int smallest =arr[0];
			for(int val:arr) {
				if(smallest>val) {
				smallest = val;
					
					
				}
				
				
			}
			
			System.out.println("smallest  element is "+smallest);
		}
	}
