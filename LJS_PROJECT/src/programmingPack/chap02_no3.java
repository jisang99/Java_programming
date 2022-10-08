package programmingPack;

import java.util.Scanner;

public class chap02_no3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, height;
		final double PI = 3.14;

		Scanner in = new Scanner(System.in);

		System.out.print("원기둥의 밑면 반지름은? ");
		radius = in.nextDouble();
		System.out.print("원기둥의 높이는? ");
		height = in.nextDouble();
		System.out.printf("원기둥의 부피는 %.1f", PI * radius * radius * height);
	}

}
