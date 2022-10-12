package programmingPack;

import java.util.Scanner;

public class chap03_no6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.print("Ã¶¼ö : ");
		s1 = in.next();
		System.out.print("¿µÈñ : ");
		s2 = in.next();

//		¹«½ÂºÎ°¡ ¾Æ´Ñ°æ¿ì
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
				System.out.println("Àß¸øµÈ ÀÔ·Â°ªÀÔ´Ï´Ù.");
		}
//		¹«½ÂºÎÀÎ °æ¿ì
		else
			System.out.println("¹«½ÂºÎÀÔ´Ï´Ù! ´Ù½ÃÇÏ¼¼¿ä.");
	}

}
