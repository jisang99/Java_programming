package programmingPack;

import java.util.Scanner;

public class chap02_no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		number = in.nextInt();

		System.out.printf("%d의 제곱은 %d", number, number * number);
	}

}
