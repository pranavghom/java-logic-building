package chapter01.frequency;

public class FrequencyofAllElements {

	public static void main(String[] args) {
		int[] arr = {2, 5, 2, 8, 5, 2};
		int count =0;
		
		for(int i =0 ; i<arr.length;i++) {
			count =0;
			boolean alradyvisited = false;
			for (int k =0 ;k<i;k++) {
				if(arr[i]==arr[k]) {
					alradyvisited = true;
					break;
					
				}
				
				
			}
			if(alradyvisited) {
				continue;
				
			}

			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
			
					
				}
				
			}
			System.out.println(arr[i]+"->"+count);
		}
	}

}
