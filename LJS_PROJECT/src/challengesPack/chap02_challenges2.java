package challengesPack;

import java.util.Scanner;

public class chap02_challenges2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;

		Scanner in = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		number = in.nextInt();

		if (number % 2 == 0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
	}

}
