package challengesPack;

import java.util.Scanner;

public class chap02_challenges1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w, h, area;
		Scanner in = new Scanner(System.in);
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		w = in.nextDouble();
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		h = in.nextDouble();

		area = w * h;

		System.out.println("���簢���� ���̴� " + area + "�Դϴ�.");
	}

}
