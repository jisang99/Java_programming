package programmingPack;

import java.util.Scanner;

public class chap02_no8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		number = in.nextInt();
		System.out.printf("각 자릿수의 합 = %d", (number / 10 / 10) + (number / 10 % 10) + (number % 10));
	}

}
