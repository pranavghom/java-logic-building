package chapter01;

public class MoveAllZerostoEnd {

	public static void main(String[] args) {
		int[] arr= {10, 0, 20, 0, 30, 40,0 ,0,3};
	
		int temp =0;
		
		
		for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[temp]=arr[i];
			temp++;	
		}
			
		}
		for(int i=temp;i<arr.length;i++) {
			arr[i]=0;
		}
		
		//System.out.println(zero);
		for(int val:arr) {
			System.out.println(val);
		}

	}

}
