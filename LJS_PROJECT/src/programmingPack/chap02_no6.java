package programmingPack;

import java.util.Scanner;

public class chap02_no6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		double F, C;
		System.out.print("화씨온도를 입력해주세요 : ");
		F = in.nextDouble();
		C = 5.0 / 9.0 * (F - 32);
		System.out.printf("섭씨온도로 환산하면 %f입니다.", C);

	}

}
