package Day16_상속예제.부모생성자호출;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동","123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " +
							student.studentNo);
	}

}
