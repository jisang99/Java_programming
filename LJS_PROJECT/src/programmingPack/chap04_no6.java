package programmingPack;

class Complex {
	private double real, imagin;

	public Complex(double r, double i) {
		this.real = r;
		this.imagin = i;
	}

	// float�� �����ϸ� ���ڵڿ� f �ٿ���� ������ �ȳ���.
	public Complex(double r) {
		this(r, 0.0);
	}

	public void print() {
		System.out.println(this.real + " + " + this.imagin + "i");
	}
}

public class chap04_no6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(2.0);
		c1.print();
		Complex c2 = new Complex(1.5, 2.5);
		c2.print();
	}

}
