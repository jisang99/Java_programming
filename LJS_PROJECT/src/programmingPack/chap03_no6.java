package programmingPack;

import java.util.Scanner;

public class chap03_no6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.print("ö�� : ");
		s1 = in.next();
		System.out.print("���� : ");
		s2 = in.next();

//		���ºΰ� �ƴѰ��
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
				System.out.println("�߸��� �Է°��Դϴ�.");
		}
//		���º��� ���
		else
			System.out.println("���º��Դϴ�! �ٽ��ϼ���.");
	}

}
