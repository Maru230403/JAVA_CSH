package Day16_상속예제2.protected접근제한자;
import Day16_상속예제.protected접근제한자.A;
public class D extends A {
	public D() {
		super();		//		super(field,method);(안되는 이유가 뭘까?)
		this.field = "value";
		this.method();
	}
	
}
