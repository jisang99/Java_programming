package programmingPack;

import java.util.Scanner;

public class chap03_no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("����� �Է��ϼ���. (ex : 1��) : ");
		String rank = in.next();

		switch (rank) {
		case "1��" -> System.out.println("���� ���߽��ϴ�");
		case "2��", "3��" -> System.out.println("���߽��ϴ�");
		case "4��", "5��", "6��" -> System.out.println("�����Դϴ�");
		default -> System.out.println("����ؾ߰ڽ��ϴ�");
		}
	}

}
