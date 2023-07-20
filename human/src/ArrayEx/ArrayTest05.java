package ArrayEx;

public class ArrayTest05 {
	public static void main(String[] args) {
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		int len = num.length;
		int temp = 0;
		
		System.out.println("교환전 배열 요소 값");
		for (int i = 0; i < len; i++) 
			System.out.print(num[i]+ "\t");
			
		for (int i = 0; i < len/2; i++) { 
			temp = num[i];
			num[i] = num[len-1-i];	// 위치를 바꾸는 식
			num[len-1-i] = temp;	// 값을 바꾸는 식
		}
		System.out.println("\n교환후 배열 요소 값");
		for (int i = 0; i < len; i++) {
			System.out.print(num[i]+"\t");
		}
	}

}
