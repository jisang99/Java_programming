package programmingPack;

//클래스
class Triangle_no1 {

	private double width, height;

	// 생성자
	public Triangle_no1(double w, double h) {
		this.width = w;
		this.height = h;
	}

	// 접근자
	public double getWidth() {
		return width;
	}

	// 접근자
	public double getHeight() {
		return height;
	}

	// 메서드
	public double findArea() {
		return 0.5 * height * width;
	}
}

public class chap04_no1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle_no1 t = new Triangle_no1(10.0, 5.0);
		System.out.println(t.findArea());
	}

}
