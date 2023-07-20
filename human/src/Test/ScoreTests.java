package Test;

import java.util.Scanner;
import java.util.Set;

public class ScoreTests {
	static	Scanner sc = new Scanner(System.in); // 전역 변수 처럼 사용한다.	
	public static void main(String[] args) {
		// 1. 과목점수 입력
		System.out.print("국어 :");
		int kor = intValue();
		System.out.print("수학 :");
		int math = intValue();
		scorePrint(kor,math);
		// 점수 합계 계산
		sum(kor,math);
		//inputScore(); // 2번		// static으로 선언된 메소드 구부정한 글씨
		// 과목 점수 출력
//		scorePrint();
//		int sum = kor + math;	
//		System.out.println("합계:" + sum);
		int sum = sumReturn(kor,math);
		System.out.println("main()메소드에 있는 sum()="+ sum);
		
	}
	public static void inputScore() {
		System.out.print("국어 :");
		int kor =sc.nextInt();
		System.out.print("수학 :");
		int math =sc.nextInt();				
		//scorePrint(kor,math);	// 메소드가 다르므로 메소드를 받음.
	}
	public static void scorePrint(int kor, int math) {	// 변수를 받아야하므로 ()안에 변수 선언 위에 국어 수학이 정수타입이기에 똑같은 타입으로 받음.
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("합계(scorePrint()메소드) ="+(kor+math));
	}
	//입력 객체 sc가 중복이 발생하기 때문에 입력 메소드를 작성한다.
	public static int intValue() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static void sum(int kor, int math) {
		int sum = kor + math;
		System.out.println("합계(sum()메소드) ="+sum);
	}
	public static int sumReturn(int kor, int math) {
		return kor+math;
	}
}
