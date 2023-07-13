package Day06.Ex05_StaticMember;

class Calculator {
	// 아래의 연산 결과를 구하는 메소드를 정의하시오.
	// 1. 절댓값
	// 2. 최댓값
	// 2. 최솟값
	public static int abs(int val) {
		return val > 0 ? val : -val;
	}
	public static int max(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int item : arr) {			// 최댓값이 return이 될 수
			if( max < item )			// 있도록 하기위해
				max = item;  			// MIN_VALUE 사용
		}
		return max;
	}
	public static int min(int arr[]) {
		int min = Integer.MAX_VALUE;
		for (int item : arr) {
			if( min > item )
				min = item;
		}
		return min;
	}
	
}

public class StaticCalculator {
	
	public static void main(String[] args) {
		int arr[] = {70, 90, 85, 50, 100};
		
		// 다른 클래스의 static 메소드를 호출하는 방법
		// - 클래스.메소드명() 형태로 메소드를 호출한다.
		System.out.println("abs(-123) : " + Calculator.abs(-123));
		System.out.println("max(arr) : " + Calculator.max(arr));
		System.out.println("min(arr) : " + Calculator.min(arr));
	}
}
