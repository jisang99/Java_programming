package programmingPack;

public class chap05_no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumExceptFirst(1, 2, 3, 4));
		int arr[] = { 2, 3 };
		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
	}

	public static int sumExceptFirst(int a, int... array) {
		int cnt = 0;

		// a�� �׳� ���������ν� ù��° ���� ���ܽ�Ų��.
		for (int i = 0; i < array.length; i++)
			cnt += array[i];

		return cnt;
	}

}
