package programmingPack;

import java.util.Scanner;

public class chap02_no8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		number = in.nextInt();
		System.out.printf("�� �ڸ����� �� = %d", (number / 10 / 10) + (number / 10 % 10) + (number % 10));
	}

}
