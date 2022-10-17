package programmingPack;

class GolfClub {
	private int number;
	private String name;

	public GolfClub() {
		this.number = 7;
		this.name = "아이언";
	}

	public GolfClub(int number) {
		this.number = number;
		this.name = "아이언";
	}

	public GolfClub(String name) {
		// 조건문 걸기 위해서 -1로 설정
		this.number = -1;
		this.name = name;
	}

	public void print() {
		if (number >= 0)
			System.out.println(this.number + "번 " + this.name + "입니다.");
		else
			System.out.println(this.name + "입니다.");
	}

}

public class chap04_no7 {

	public static void main(String[] args) {
		GolfClub g1 = new GolfClub();
		g1.print();

		GolfClub g2 = new GolfClub(8);
		g2.print();

		GolfClub g3 = new GolfClub("퍼터");
		g3.print();
	}

}
