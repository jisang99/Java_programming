package programmingPack;

//Ŭ����
class Triangle {

	private double width, height;

	// ������
	public Triangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	// ������
	public double getWidth() {
		return width;
	}

	// ������
	public double getHeight() {
		return height;
	}

	// ���� ���ϴ� �޼���
	public double findArea() {
		return 0.5 * height * width;
	}

	// ���� ������ ���ϴ� �޼���
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
