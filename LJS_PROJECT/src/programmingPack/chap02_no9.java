package programmingPack;

import java.util.Scanner;

public class chap02_no9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int majore, ge, general;

		System.out.print("���� �̼� ���� : ");
		majore = in.nextInt();
		System.out.print("���� �̼� ���� : ");
		ge = in.nextInt();
		System.out.print("�Ϲ� �̼� ���� : ");
		general = in.nextInt();

		if (majore + ge + general >= 140) {
			if (majore >= 70 && (ge + general >= 80 || (ge >= 30 && general >= 30)))
				System.out.println("���� ����");
			else
				System.out.println("���� �Ұ���");
		} else
			System.out.println("���� �Ұ���");
	}

}
