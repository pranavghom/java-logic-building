package chapter01.Misc_Mixed;

public class SecondLargest {
	
	
	public static void main(String[] args) {
		int max1=Integer.MIN_VALUE;
		
		int max2= Integer.MIN_VALUE;
		
		
	
		//int[] arr = {12, 45 ,7 ,89 ,23  ,89,67,68,1};
		int[] arr = {100, 90, 95};
		for(int i=0;i<arr.length;i++) {
			if(max1<arr[i]) {  
				max2=max1;
				max1 = arr[i];		
			}
			else if(arr[i]>max2){
				if(arr[i]!=max1) {
					max2=arr[i];
				}
				
				
			}
			
			
		}
		
		
		System.out.println(max1);
		System.out.println(max2);
}

}
