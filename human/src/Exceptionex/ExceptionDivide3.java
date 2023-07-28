package Exceptionex;

public class ExceptionDivide3 {
	public static void main(String[] args) {
		int num2 = 0;
		try {
		int num1 =100;
		num2 = num1/20;
		num2= num1*100;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없다");
		}
		System.out.println(num2);

		System.out.println("프로그램 종료");	
	}
}
