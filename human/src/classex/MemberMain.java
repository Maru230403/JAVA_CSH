package classex;

import java.util.Scanner;

public class MemberMain {
	static Scanner sc = new Scanner(System.in);
	public static void showMenu() {
			System.out.println("1.회원입력\n2.회원조회\n3.회원삭제\n4.회원변경\n5.전체조회\n6.종료");
			System.out.print("메뉴 선택: ");
		}
	
	public static void main(String[] args) {
		int sel=0;
		while (true) {
			showMenu();
			sel = sc.nextInt();
		switch (sel) {
		case 1: 
			System.out.println("회원입력");
			break;
		case 2: 
			System.out.println("회원조회"); 
			break;
		case 3: 
			System.out.println("회원삭제");
			break;
		case 4:
			System.out.println("회원변경");
			break;
		case 5: 
			System.out.println("전체조회");
			break;
		case 6:
			System.out.println("프로그램을 종료함");
			System.exit(0);

			sc.close();
		}
		}
	}
}
	

	
	



