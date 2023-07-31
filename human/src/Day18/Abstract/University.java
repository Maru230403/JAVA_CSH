package Day18.Abstract;

public class University extends Student{
	private int courses;
	public University(String name, int grade, int courses) {
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	
	public String getStudInfo() {
		System.out.println("University 클래스의 getStudInfo 메소드 호출");
		return "이름은>>" + name + ", 학년은>>" + grade + ", 신청 학점은>>" + courses;
	}
	
	public String getProfessor() {	// 지도 교수님 이름 구하는 메소드
		return "이순신 교수님";
	}
}
