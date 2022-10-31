package programmingPack;

import java.util.Scanner;

public class chap05_no5 {

	public static void main(String[] args) {
		int number[] = new int[10];

		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 10개 입력하세요.");
		for (int i = 0; i < 10; i++) {
			number[i] = in.nextInt();
			// 일다 여기까지 하다가 그만둠
		}

	}
}
