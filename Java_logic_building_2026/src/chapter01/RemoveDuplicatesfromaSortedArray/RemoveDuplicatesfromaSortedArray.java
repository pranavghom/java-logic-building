package chapter01.RemoveDuplicatesfromaSortedArray;

public class RemoveDuplicatesfromaSortedArray {

	public static void main(String[] args) {
	int[] arr = {1,1,1,1,2,2,2,3,4,4,5};
	int temp = 0;
	
	
	for(int i =1; i<arr.length;i++) {
		if(arr[i]!=arr[temp]) {
			
			arr[temp+1]=arr[i];
			
					temp++;
		}
		

	}
		
		for(int var =0; var<=temp;var++) {
			System.out.println(arr[var]);
		}
		
		//
	}

	}

