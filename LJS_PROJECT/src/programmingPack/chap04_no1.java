package programmingPack;

//Ŭ����
class Triangle_no1 {

	private double width, height;

	// ������
	public Triangle_no1(double w, double h) {
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

	// �޼���
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
