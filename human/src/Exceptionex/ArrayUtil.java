package Exceptionex;

public class ArrayUtil {
	public void call() throws Exception {
		System.out.println("call 메소드 시작");
		int[] num = new int[2];
//		try {			
		num[0] = 1;
		num[1] = 2;
		num[2] = 3; //예외 발생
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
		System.out.println("call 메소드 종료");
	}
}
