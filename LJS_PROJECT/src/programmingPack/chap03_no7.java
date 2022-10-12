package programmingPack;

import java.util.Scanner;

public class chap03_no7 {

	public static String input(String s) {
		Scanner in = new Scanner(System.in);
		System.out.printf("%s : ", s);
		return in.next();
	}

	public static void whosWin(String s1, String s2) {
		if (!s1.equals(s2)) {
			if (s1.equals("r")) {
				if (s2.equals("p"))
					System.out.println("¿µÈñ, ½Â!");
				else if (s2.equals("s"))
					System.out.println("Ã¶¼ö, ½Â!");
			}

			else if (s1.equals("p")) {
				if (s2.equals("r"))
					System.out.println("Ã¶¼ö, ½Â!");
				else if (s2.equals("s"))
					System.out.println("¿µÈñ, ½Â!");
			}

			else if (s1.equals("s")) {
				if (s2.equals("p"))
					System.out.println("Ã¶¼ö, ½Â!");
				else if (s2.equals("r"))
					System.out.println("¿µÈñ, ½Â!");
			} else
				System.out.println("Àß¸øµÈ °ªÀÌ ÀÔ·ÂµÇ¾ú½À´Ï´Ù.");
		} else
			System.out.println("¹«½ÂºÎÀÔ´Ï´Ù! ´Ù½ÃÇÏ¼¼¿ä.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = input("Ã¶¼ö");
		String y = input("¿µÈñ");
		whosWin(c, y);
	}

}
