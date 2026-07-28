package chapter01.frequency;

import java.util.Scanner;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int frCount=0;
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Target Element ");
		int target =sc.nextInt();
		int[] arr = {5, 2, 8, 2, 1, 2, 9};
		for(int val:arr) {
			if(target == val) {
				frCount++;
				
			}
			
		}
System.out.println("Frequency = "+frCount);
	}

}
