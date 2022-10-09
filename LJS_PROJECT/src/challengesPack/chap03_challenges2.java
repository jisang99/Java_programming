package challengesPack;

import java.util.Scanner;

public class chap03_challenges2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		result = factorial(n);
		System.out.println(result);
	}

	static int factorial(int x) {
		int r = 1;

		while (x > 0) {
			r *= x;
			x--;
		}

		return r;
	}

}
