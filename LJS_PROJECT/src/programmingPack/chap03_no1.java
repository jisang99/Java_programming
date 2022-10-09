package programmingPack;

import java.util.Scanner;

public class chap03_no1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();

		if (age >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");
	}

}
