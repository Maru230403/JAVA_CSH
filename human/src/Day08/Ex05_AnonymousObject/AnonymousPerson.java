package Day08.Ex05_AnonymousObject;

public class AnonymousPerson {
	
	// 익명 자식 객체 생성
	Person person = new Person() {
		
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("프로그래밍을 합니다.");
			System.out.println();
		}
	};
	
	Person person2 = new Person() {
		
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("요리를 합니다.");
			System.out.println();
		}
	};
	
	void method() {
		person.name = "김휴먼";
		person.age = 20;
		person.work();
		
		person.name = "백종원";
		person.age = 40;
		person.work();		
	}
	
}
