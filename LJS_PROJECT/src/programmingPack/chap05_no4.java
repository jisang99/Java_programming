package programmingPack;

import java.util.Scanner;

public class chap05_no4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("URL�� �Է��ϼ��� : ");
			String url = in.next();

			if (url.equals("bye"))
				break;

			if (url.contains("com"))
				System.out.println("\'com\'���� �����ϴ�.");
			else
				System.out.println("\'com\'���� ������ �ʽ��ϴ�.");

			if (url.contains("java"))
				System.out.println("\'java\'�� �����մϴ�.");
			else
				System.out.println("\'java\'�� �������� �ʽ��ϴ�.");

		}

	}

}
