package programmingPack;

class Dice {
	private int face;

	// �ֻ��� ���� �������� ��������
	// �� ���� ������ Ȯ���� �������� �ʴ´�!
	// ����� �غ����� ������.
	public int roll() {
		this.face = (int) (Math.random() * 10) % 6 + 1;
		return this.face;
	}
}

public class chap04_no8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d = new Dice();
		System.out.println("�ֻ����� ���� : " + d.roll());
	}

}
