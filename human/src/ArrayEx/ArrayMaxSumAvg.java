package ArrayEx;

import java.util.Scanner;
// 56 87 12 32 53 89 90 92 96 100
public class ArrayMaxSumAvg {   
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	int sum = 0;		// int max=0,avg=0,sum=0;
	int avg = 0;
	int max = 0;
	System.out.println("10개의 값을 입력해주세요");
	 for(int i = 0; i < arr.length; i++) {
		System.out.print((i+1) + "번째 값 :");
		arr[i]= sc.nextInt(); 	// 배열의 값을 입력할때
		sum += arr[i]; 		// 합
		
		if(max<arr[i]) max = arr[i];
	 }
	 	avg = sum/arr.length;
	 	System.out.println("결과");
	 	System.out.println("합계: "+sum +"/평균: "+ avg+"/최대값: "+ max);
	 
	 	for(int i = 0; i < arr.length; i++) 
	 		System.out.print(arr[i]+ "\t");
	 	// 오름차순 정렬
//				int temp = 0;
	 for(int i = 0; i < arr.length; i++) {
		for(int j = i+1 ; j< arr.length; j++) {
			if(arr[i] < arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("\n=============================================================================");	
	 for(int i = 0; i <arr.length; i++)
	 System.out.print(arr[i]+"\t");
	 
}

}