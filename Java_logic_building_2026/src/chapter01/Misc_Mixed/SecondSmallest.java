package chapter01.Misc_Mixed;

public class SecondSmallest {

	public static void main(String[] args) {
		int smallestNumber=Integer.MAX_VALUE;
		int secondNumber= Integer.MAX_VALUE;
		
		//int[] arr = {5,5,5,5};
		int[] arr = {12, 45 ,7 ,89 ,23  ,89,67,68,1};
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]<smallestNumber) {
				secondNumber= smallestNumber;
				smallestNumber	=arr[i];
				
			}
			else if(arr[i]<secondNumber){
				if(arr[i]!=smallestNumber) {
					 // System.out.println();
				secondNumber= arr[i];
			}
		}
		}
		if(secondNumber == Integer.MAX_VALUE) {
			System.out.println("No Second Smallest Element");
			
		}else {
			System.out.println("Second Smallest Number = "+secondNumber);
		}
			
		
  
	   
  System.out.println("Smallest Number = "+smallestNumber);
		

	}
	}

