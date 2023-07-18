package classex;

import java.util.Scanner;

public class MemberTest {
	// 속성,메소드
	public static void main(String[] args) {
//		Member member = new Member();	// 객체는 유일성(하나밖에 없다)
//	//  클래스    객체     번지  생성자메소드(멤버변수를 초기화 한다)
//		System.out.println("1번"+member.toString()); // heap 할당 classex.Member@6f2b958e
//		//member.name="java";
//		//System.out.println(member.name); 		// 중괄호 안의 변수는 다 지역변수이다.
//		String name = "자바";  // 또는 null
//		System.out.println(name);				//initialized : 초기화
//		////////////////////////////////////////////////
//		member.setId("자바...");
//		member.setPwd("자바");
//		System.out.println("2번"+member);
//		String id =member.getId();
//		System.out.println(id);
//		
//		Member member2 = new Member("java","java"); // set 메소드와 같은 기능
//		
//		String id2 =member2.getId();
//		String pwd2 = member2.getPwd();
//		System.out.println("id="+id2+",pwd="+pwd2);
//		System.out.printf("id=%10s, pwd=%-10s\n\n",id2,pwd2);
//		
//		Address address = new Address("서울","영등포구","영등");
//		Member mem =new Member("javamem","javamem","javamem",address);
//		System.out.println("주소 :"+address);
//		System.out.println("Member:"+mem);
		Scanner sc = new Scanner(System.in);
		System.out.print("ID:");
		String id =sc.next();
		System.out.print("PWD:");
		String pwd =sc.next();
		// 입력후 Member클래스의 생성자 메소드(==setXXXX())로 전달하여 출력한다
		Member member = new Member(id,pwd);
		String id2 = member.getId();	//String id2="java";
		String pwd2 = member.getPwd();
		System.out.println("ID:"+id2 + " PWD:"+pwd2);
		// 입력 값을 setXXX()로 전달하여 출력하시오
		member.setId(id2);	//	member라는 객체 안에 id와 pwd가 있다 그래서 mwmber만 전달하면 됨.
		member.setPwd(pwd2);
		String id3 = member.getId();
		String pwd3 = member.getPwd();
		System.out.println("ID:"+id3 + " PWD:"+pwd3);
		// 값 변경
		member.setId("computer");
		System.out.println("ID:"+member.getId() + " PWD:"+pwd3);
		// 값 조회
		id3= member.getId();
		pwd3= member.getPwd();
				System.out.println("ID:"+member.getId() + " PWD:"+pwd3);
		
	}
}
