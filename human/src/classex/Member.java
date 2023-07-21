 package classex;
//dto(data transfer object) vo(value object)
public class Member {
	private String id;			// 단일 값
	private String pwd;
	private String name;
	private String email;
	private Address address;
	
	// 생성자와 메소드가 없으면 컴파일러가 초기화 시켜준다.
	public Member() {			// overloading
		//반환타입이 없다
	}
	public Member(String id, String pwd,String email) {	// 데이터 타입이 같고 개수가 같으면 에러 ex) String이 2개 밑에는 3개면 쓸수 있지만 2개 2개면 못씀
		this.id = id;						// 무조건 데이터 타입을 봐라 ex) String,String 밑줄 String,int면 가능 
		this.pwd = pwd;
		this.email=email;
	}

	public Member(String id, String name, String email,Address addr) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=addr;		// 멤버변수
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public String getPwd() {
		return pwd;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setAddress(Address addr) {
		this.address = addr;
	}
	
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", email=" + email + "]";
	}
	public void printMember() {
		System.out.println("ID :"+ id);
		System.out.println("PWD :"+ pwd);
		System.out.println("Email :"+ email);
	}
//	@Override
//	public String toString() {
//		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", address=" + address
//				+ "]";
//	}

}
// member는 주소를 가진다
// 홍길동은 주소가 있다
// 주소: 시 구 동 구성(변수가 3개)
// class Member{							   ( 회원은 주소다 )		X
//	Address address;  Member와 address는 포함관계 (회원은 주소를 가지고 있다)O
