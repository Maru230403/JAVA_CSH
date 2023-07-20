package ArrayEx;

public class ArrayTest08 {
	public static void main(String[] args) {
		int[] arr = {1,3,9,13,15};
		float avg = 0.0f;
		int total = 0;
		for (int i = 0; i < arr.length; i++) 
			total += arr[i];//total = total + arr[i];
					
		avg = (float) total/arr.length;
		System.out.println("합계:" + total);
		System.out.println("평균:" + avg);
		//합계 : 40
		// 평균8.0
		
	
	}

}
