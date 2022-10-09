package challengesPack;

import java.util.Scanner;

public class chap03_challenges1 {

	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();

		result = 1;
		while (true) {
			if (n > 0) {
				result *= n;
				n--;
			} else
				break;

		}

		System.out.println(result);
	}

}
