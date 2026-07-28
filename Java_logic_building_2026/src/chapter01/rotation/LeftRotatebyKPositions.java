package chapter01.rotation;

public class LeftRotatebyKPositions {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int k =2;
		int[] temp = new int[k];
		for(int i=0;i<temp.length;i++) {
			temp[i]=arr[i];
		}
		
		for(int i=0;i<arr.length-k;i++) {
			
		arr[i]=arr[i+k];
		}
		for(int i =0 , k1 = arr.length-k ;i<temp.length;i++,k1++) {
			arr[k1]=temp[i];
		}
		
		
	
		for(int val:arr) {
			System.out.println(val);
		}
		
	
		
	}

}
