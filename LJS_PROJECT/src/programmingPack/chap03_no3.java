package programmingPack;

import java.util.Scanner;

public class chap03_no3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int sum = 0;
		do {
			System.out.print("���� ������ �Է��ϼ��� : ");
			number = in.nextInt();
			if (number % 2 == 0)
				sum += number;

		} while (number > 0);
		System.out.println("�Է��� ���� ���� �߿��� ¦���� ���� " + sum);
	}
}