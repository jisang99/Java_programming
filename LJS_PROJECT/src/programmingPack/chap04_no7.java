package programmingPack;

class GolfClub {
	private int number;
	private String name;

	public GolfClub() {
		this.number = 7;
		this.name = "���̾�";
	}

	public GolfClub(int number) {
		this.number = number;
		this.name = "���̾�";
	}

	public GolfClub(String name) {
		// ���ǹ� �ɱ� ���ؼ� -1�� ����
		this.number = -1;
		this.name = name;
	}

	public void print() {
		if (number >= 0)
			System.out.println(this.number + "�� " + this.name + "�Դϴ�.");
		else
			System.out.println(this.name + "�Դϴ�.");
	}

}

public class chap04_no7 {

	public static void main(String[] args) {
		GolfClub g1 = new GolfClub();
		g1.print();

		GolfClub g2 = new GolfClub(8);
		g2.print();

		GolfClub g3 = new GolfClub("����");
		g3.print();
	}

}
