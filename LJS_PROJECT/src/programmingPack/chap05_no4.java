package programmingPack;

import java.util.Scanner;

public class chap05_no4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("URL을 입력하세요 : ");
			String url = in.next();

			if (url.equals("bye"))
				break;

			if (url.contains("com"))
				System.out.println("\'com\'으로 끝납니다.");
			else
				System.out.println("\'com\'으로 끝나지 않습니다.");

			if (url.contains("java"))
				System.out.println("\'java\'를 포함합니다.");
			else
				System.out.println("\'java\'를 포함하지 않습니다.");

		}

	}

}
