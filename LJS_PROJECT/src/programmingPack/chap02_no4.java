package programmingPack;

import java.util.Scanner;

public class chap02_no4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds;

		Scanner in = new Scanner(System.in);

		System.out.print("초 단위 정수를 입력하세요 : ");
		seconds = in.nextInt();

		System.out.printf("%d시간 %d분 %d초", seconds / 60 / 60, seconds / 60 % 60, seconds % 60);

	}

}
