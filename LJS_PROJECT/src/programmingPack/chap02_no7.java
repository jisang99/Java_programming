package programmingPack;

import java.util.Scanner;

public class chap02_no7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int number;
		number = in.nextInt();

		System.out.println(number % 4 == 0);
		System.out.println(number % 5 == 0);
	}
}
