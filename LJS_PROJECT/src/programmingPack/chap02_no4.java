package programmingPack;

import java.util.Scanner;

public class chap02_no4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds;

		Scanner in = new Scanner(System.in);

		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		seconds = in.nextInt();

		System.out.printf("%d�ð� %d�� %d��", seconds / 60 / 60, seconds / 60 % 60, seconds % 60);

	}

}
