package Day07.Ex02_Shape;
// Shape 클래스를 구현하시오.
public class Triangle extends Shape {
	// 멤버변수로 가로, 높이 길이를 저장할 변수를 선언하시오.
	double width, height;

	// 생성자를 정의하시오.
	public Triangle() {
		this(0,0);
	}

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		// (가로 X 세로) / 2
		return (width * height) / 2;
	}
	
	@Override
	double round() {
		// (정삼각형) : (한 변의 길이) x 3
		return width * 3;
	}
	// getter, setter 메소드를 정의하시오.

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	// toString() 메소드를 재정의하시오.

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
}
