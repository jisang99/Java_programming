package programmingPack;

import java.util.Scanner;

public class chap03_no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("등수를 입력하세요. (ex : 1등) : ");
		String rank = in.next();

		switch (rank) {
		case "1등" -> System.out.println("아주 잘했습니다");
		case "2등", "3등" -> System.out.println("잘했습니다");
		case "4등", "5등", "6등" -> System.out.println("보통입니다");
		default -> System.out.println("노력해야겠습니다");
		}
	}

}
