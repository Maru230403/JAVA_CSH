package Day18.Abstract;

public class Elementary extends Student{
	public Elementary(String name, int grade, int point) {
		System.out.println("Elementary 생성자 호출");
		super.name = name;
		super.grade = grade;
	}
	public String getClassTeacher() {
		return "박길순 선생님";	// 담임선생님 이름 구하는 메소드
	}
}
