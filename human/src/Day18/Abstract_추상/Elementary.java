package Day18.Abstract_추상;

public class Elementary extends Student{
	public Elementary(String name, int grade, String teacher) {
		System.out.println("Elementary 생성자 호출");
		super.name = name;
		super.grade = grade;
		super.teacher = teacher;
	}
	public String getTeacher() {
		return "담임선생님 :" + super.teacher;
	}
}
