package programmingPack;

import java.util.Scanner;

public class chap03_no3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int sum = 0;
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			number = in.nextInt();
			if (number % 2 == 0)
				sum += number;

		} while (number > 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
	}
}