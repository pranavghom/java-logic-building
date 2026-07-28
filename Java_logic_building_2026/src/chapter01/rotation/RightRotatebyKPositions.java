package chapter01.rotation;

public class RightRotatebyKPositions {
	
	
public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int k =2;
		int[] temp = new int[k];
		
		
		
		for(int i=arr.length-k,j=0;i<arr.length;i++,j++) {
			temp[j]=arr[i];
		}
		int t = k;
		for(int i = arr.length-1;i>=k;i--) {
			arr[i]=arr[t];
			
			t--;
		}
		for(int i=0;i<k;i++) {
			arr[i]=temp[i];
		}
			
	
		for(int val:arr) {
			System.out.println(val);
		}
		
	
		
	}

}
