package programmingPack;

class Dice {
	private int face;

	// 주사위 값은 랜덤으로 나오지만
	// 각 면이 동등한 확률로 나오지는 않는다!
	// 고민을 해볼만한 문제다.
	public int roll() {
		this.face = (int) (Math.random() * 10) % 6 + 1;
		return this.face;
	}
}

public class chap04_no8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d = new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());
	}

}
