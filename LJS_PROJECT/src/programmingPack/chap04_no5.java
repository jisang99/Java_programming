package programmingPack;

class Line {
	int length;

	public Line(int length) {
		this.length = length;
	}

	public boolean isSameLine(Line l) {
		if (this.length == l.length)
			return true;
		else
			return false;
	}
}

public class chap04_no5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line a = new Line(1);
		Line b = new Line(1);

		System.out.println(a.isSameLine(b));
		System.out.println(a == b);
	}

}
