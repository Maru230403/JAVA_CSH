package classex;

// 외부에서 요청 처리 service
public class MemberService {
	final int MAX_CNT = 50; //
	Member[] member = new Member[MAX_CNT];
	int cnt = 0;

	public void inputData() {
		System.out.println("회원입력");
		System.out.print("ID:");
		String id = InputScanner.sc.next();
		System.out.print("PWD:");
		String pwd = InputScanner.sc.next();
		System.out.print("EMAIL:");
		String email = InputScanner.sc.next();
		// 입력한 내용을 객체로 생성후 배열에 저장
		member[cnt++] = new Member(id, pwd, email);
		System.out.println("데이터 입력이 완료되었습니다.");
	}

	public void searchData() {
		// 이름으로 검색한다
		// 검색: compareTo()메소드 사용한다
		// 삭제,변경 사용시 자료를 검색한다
		// 공통 메소드 작성(search(String name))
		System.out.println("데이터를 검색합니다");
		System.out.print("ID :");
		String id = InputScanner.sc.next();
		int index = search(id); // search 는 공통 메소드이름
		if (index < 0)
			System.out.println("데이터가 없음");
		else {
			// 해당 검색 데이터를 출력한다
			 // member[index].printMember();  
			   System.out.println(member[index].toString());
		}
		System.out.println("데이터 검색 완료");
	}

	private  int search(String id) { //객체를 가지고 올때는 객체.이름/ 객체.get이름
		// 매개변수 id와 배열에 있는 id를 비교
		for(int i = 0; i <cnt; i ++) {	
		Member mem = member[i];
		if(id.compareTo(mem.getId())==0)
		return i;	
		}
		
		return -1;
	}

	public void deleteData() {
		System.out.println("데이터를 삭제합니다");
		System.out.print("ID :");
		String id = InputScanner.sc.next();
		int index = search(id); // id는 index를 찾은 배열의 위치값(?)
		
		if (index < 0)
			System.out.println("데이터가 없음");
		else { 
			for(int i = index; i <cnt; i++) {
				member[i]= member[i+1];
			}
			cnt--;	// 삭제시 배열을 하나씩 당겨서 채워야 하므로 cnt--; 입력
			System.out.println("데이터 삭제 완료");
		}
		
	}

	public void updateData() {
		System.out.println("데이터를 수정합니다");
		System.out.print("ID: ");
		String id = InputScanner.sc.next();
		int index = search(id);
		System.out.println(member[index].toString());
		System.out.println("ID: ");
		System.out.print("PWD: ");
		String pwd = InputScanner.sc.next();
		System.out.print("EMAIL: ");
		String email = InputScanner.sc.next();
		System.out.println("데이터를 수정했습니다");

		
	}

	public void totalPrint() {
	}

}
