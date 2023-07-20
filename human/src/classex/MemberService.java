package classex;

import java.util.Scanner;

// 외부에서 요청 처리 service
public class  MemberService {
	static int max = 10;
	static Member[] MemberList = new Member[max];
	static Scanner sc = new Scanner(System.in);
	public static void inputData() {
		System.out.println("회원입력");
		System.out.print("ID:");
		String id =MemberMain.sc.next();
		System.out.print("PWD:");
		String pwd =MemberMain.sc.next();
	}
	public static void searchData() {	
	System.out.println("회원조회");
	for (Member member : MemberList) {
		System.out.println(member);
	}
	}
	public static void deleteData() {
		System.out.println("회원삭제");
	}
	public static void updateData() {
		System.out.println("회원변경");
	}
	public static void totalPrint() {
		System.out.println("전체조회");
	}
	

}
