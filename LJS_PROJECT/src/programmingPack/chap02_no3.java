package programmingPack;

import java.util.Scanner;

public class chap02_no3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, height;
		final double PI = 3.14;

		Scanner in = new Scanner(System.in);

		System.out.print("������� �ظ� ��������? ");
		radius = in.nextDouble();
		System.out.print("������� ���̴�? ");
		height = in.nextDouble();
		System.out.printf("������� ���Ǵ� %.1f", PI * radius * radius * height);
	}

}
