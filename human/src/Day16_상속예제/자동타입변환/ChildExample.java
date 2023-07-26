package Day16_상속예제.자동타입변환;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3();  	(호출 불가능)
	}
}
