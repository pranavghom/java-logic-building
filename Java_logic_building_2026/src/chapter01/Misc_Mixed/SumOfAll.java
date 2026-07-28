package chapter01.Misc_Mixed;

public class SumOfAll {
//Find the sum of all elements.
	//Find the average of the array.
	public static void main(String[] args) {
		int sum=0;
		int avg =0;
		
		
		int[] arr = {10,20,34,45,54,54,67,76,4,3};
		for(int v: arr) {
			sum +=v;

			
		}
		
		avg = sum/arr.length;
			System.out.println("sum of all element is "+sum);
			System.out.println("Avg of all element is "+avg);


			
			
			
			
	}
	
	
	}


