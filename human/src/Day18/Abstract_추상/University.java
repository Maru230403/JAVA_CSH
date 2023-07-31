package Day18.Abstract_추상;

public class University extends Student{
	private int courses;
	public University(String name, int grade, String teacher) {
		super();
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade = grade;
		super.teacher = teacher;
		this.courses = courses;
	}
	
	public String getStudInfo() {
		System.out.println("University 클래스의 getStudInfo 메소드 호출");
		return "이름은>>" + name + ", 학년은>>" + grade + ", 신청 학점은>>" + courses;
	}
	
	// 상위 클래스의 추상 메소드를 반드시 구현한다.
	public String getProfessor() {	
		return "지도 교수님:" + super.teacher;
	}
}
