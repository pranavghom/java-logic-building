package chapter01.CopyOneArrayintoAnother;

public class CopyOneArrayintoAnother {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int[] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length;i++) {
			arr2[i]=arr[i];
			
		}
		for(int val:arr2) {
				System.out.println(val);
	}
		}

}
