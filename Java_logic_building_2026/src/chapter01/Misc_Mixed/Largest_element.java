package chapter01.Misc_Mixed;
//Find the largest element.
public class Largest_element {
	public static void main(String[] args) {
		int largestEle =0;
		
		
		int[] arr = {121,10,20,34,45,54,54,67,76,4,3};
		
		for(int val:arr) {
			if(largestEle<val) {
				largestEle = val;
				
				
			}
			
			
		}
		
		System.out.println("Largest  element is "+largestEle);
	}
}
