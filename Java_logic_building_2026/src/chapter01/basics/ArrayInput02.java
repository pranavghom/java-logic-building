package chapter01.basics;

import java.util.Scanner;
//Take 5 numbers from the user and print them.
public class ArrayInput02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enterthe ARRAY ELEMENT ");
			arr[i] = sc.nextInt();
			
		}
		
	

	for(int v: arr) {
		System.out.println("Array element is"+v);
		
		System.out.println(v);
		
	}
	
}

}

