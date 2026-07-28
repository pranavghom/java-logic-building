package chapter01.searching;

public class ArrayLinearSearch {
//Search for a given element (Linear Search).
	public static void main(String[] args) {
		int[]arr={23,43,5,67,34,213};
		int target = 213;
		boolean found =false;
		
		for (int i =0;i<arr.length;i++) {
			if(target == arr[i]) {
				
				System.out.println("Targeted Element " +target);
				found=true;
				break;
			}
		}
		
		if(!found) {
			  System.out.println("Element Not Found");
			
		}
		
		

	}

}
