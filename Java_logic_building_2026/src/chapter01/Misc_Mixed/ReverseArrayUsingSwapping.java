package chapter01.Misc_Mixed;

public class ReverseArrayUsingSwapping {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int start=0;
		int end=arr.length-1;
		int temp=0;
		
		for(int i = 0; i<arr.length/2;i++)
	{
			
			temp= arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			
			
			
			
			
			start ++;
			end--;
			
			
			
		}
		for(int val:arr)
		System.out.println(val);
	}

}





//second try

//package Arrays;
//
//public class ReverseArrayUsingSwapping {
//
//	public static void main(String[] args) {
//		int[] arr = {10, 20, 30, 40, 50};
//		int start=0;
//		int end=arr.length-1;
//		int temp=0;
//		
//		while(start<end)
//	{
//			
//			temp= arr[start];
//			arr[start]= arr[end];
//			arr[end]= temp;
//			
//			
//			
//			
//			
//			start ++;
//			end--;
//			
//			
//			
//		}
//		for(int val:arr)
//		System.out.println(val);
//	}
//
//}
//
