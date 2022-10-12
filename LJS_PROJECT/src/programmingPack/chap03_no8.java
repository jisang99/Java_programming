package programmingPack;

public class chap03_no8 {

	static int factorial(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			switch (i) {
			case 1 -> System.out.print("계산 결과 : ");
			default -> fact *= i;
			}

		}
		return fact;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

}
