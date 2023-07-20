package ArrayEx;

import java.util.Scanner;

public class ArrayMaxMin {
	// 값 입력 :
	// 300 200 100 700 400
	// Maximum Value : 700  Minimum Value : 100
	
//	int[] num = {300,200,100,700,400};
//	max=num[0];
//	min=num[0];
//	for() {
//		if(max)
//			if(min)
//	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int[] arr =new int[5];
	
	System.out.println("값입력..");
	for(int i = 0; i < arr.length; i++) {
		arr[i] =sc.nextInt();
	}
	int max = arr[0];
	int min = arr[0];
	
	for(int i = 1; i < arr.length; i++) {
		if(max<arr[i]) max = arr[i];
			if(min>arr[i]) min =arr[i];			
		}
	System.out.println("Max :" + max);
		System.out.println("Min :" + min);
	}
	}


