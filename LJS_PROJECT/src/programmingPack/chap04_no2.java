package programmingPack;

//클래스
class Triangle {

	private double width, height;

	// 생성자
	public Triangle(double w, double h) {
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

	// 넓이 구하는 메서드
	public double findArea() {
		return 0.5 * height * width;
	}

	// 넓이 같은지 비교하는 메서드
	public boolean isSameArea(Triangle t) {
		if (t.findArea() == this.findArea())
			return true;
		else
			return false;
	}

}

public class chap04_no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);

		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
