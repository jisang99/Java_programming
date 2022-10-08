package programmingPack;

import java.util.Scanner;

public class chap02_no9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int majore, ge, general;

		System.out.print("전공 이수 학점 : ");
		majore = in.nextInt();
		System.out.print("교양 이수 학점 : ");
		ge = in.nextInt();
		System.out.print("일반 이수 학점 : ");
		general = in.nextInt();

		if (majore + ge + general >= 140) {
			if (majore >= 70 && (ge + general >= 80 || (ge >= 30 && general >= 30)))
				System.out.println("졸업 가능");
			else
				System.out.println("졸업 불가능");
		} else
			System.out.println("졸업 불가능");
	}

}
