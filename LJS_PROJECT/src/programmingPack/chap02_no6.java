package programmingPack;

import java.util.Scanner;

public class chap02_no6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		double F, C;
		System.out.print("ȭ���µ��� �Է����ּ��� : ");
		F = in.nextDouble();
		C = 5.0 / 9.0 * (F - 32);
		System.out.printf("�����µ��� ȯ���ϸ� %f�Դϴ�.", C);

	}

}
