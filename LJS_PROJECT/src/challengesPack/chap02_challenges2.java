package challengesPack;

import java.util.Scanner;

public class chap02_challenges2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;

		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		number = in.nextInt();

		if (number % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}

}
