package classex;


public class MemberMain {
	
	public static void showMenu() {
			System.out.println("1.회원입력\n2.회원조회\n3.회원삭제\n4.회원변경\n5.전체조회\n6.종료");
			System.out.print("메뉴 선택: ");
		}
	
	public static void main(String[] args) {
		MemberService ms = new  MemberService();
		int sel=0;
		while (true) {
			showMenu();
			sel = InputScanner.sc.nextInt();
		switch (sel) {
		case 1: 
			ms.inputData();
			break;
		case 2: 
				System.out.println("회원조회");
				ms.searchData();
			break;
		case 3: 
			System.out.println("회원삭제");
			ms.deleteData();
			break;
		case 4:
			System.out.println("회원변경");
			ms.updateData();
			break;
		case 5: 
			System.out.println("전체조회");
			ms.totalPrint();
			break;
		case 6:
			System.out.println("프로그램을 종료함");
			System.exit(0);
		}
		}
	}
}
	

	
	



