package programmingPack;

import java.util.Scanner;

public class chap03_no7 {

	public static String input(String s) {
		Scanner in = new Scanner(System.in);
		System.out.printf("%s : ", s);
		return in.next();
	}

	public static void whosWin(String s1, String s2) {
		if (!s1.equals(s2)) {
			if (s1.equals("r")) {
				if (s2.equals("p"))
					System.out.println("����, ��!");
				else if (s2.equals("s"))
					System.out.println("ö��, ��!");
			}

			else if (s1.equals("p")) {
				if (s2.equals("r"))
					System.out.println("ö��, ��!");
				else if (s2.equals("s"))
					System.out.println("����, ��!");
			}

			else if (s1.equals("s")) {
				if (s2.equals("p"))
					System.out.println("ö��, ��!");
				else if (s2.equals("r"))
					System.out.println("����, ��!");
			} else
				System.out.println("�߸��� ���� �ԷµǾ����ϴ�.");
		} else
			System.out.println("���º��Դϴ�! �ٽ��ϼ���.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = input("ö��");
		String y = input("����");
		whosWin(c, y);
	}

}
