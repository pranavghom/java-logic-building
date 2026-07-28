package chapter01.sort;

public class ArrayisSorted {

	public static void main(String[] args) {
		//int[] arr = {10, 30, 20, 40, 50};
		int[] arr = {10, 30, 36, 40, 50};
		//int[] arr = {5, 5, 5, 5};
		boolean isSorted = false;
		for(int i =0; i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				
			}
			else{
				isSorted = true;
				break;
			}
			
		}
		if(isSorted) {
			System.out.println("Array is not Sorted");
		}
		else {
			System.out.println("Array is Sorted");
			
		}

	}

}
