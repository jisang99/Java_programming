package programmingPack;

import java.util.Scanner;

public class chap03_no10 {

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.print("���� ������ �Է��ϼ��� : ");
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num))
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		else
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
	}

}