package programmingPack;

public class chap05_no1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countChar("abcabca", 'a'));
	}

	public static int countChar(String s, char c) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				cnt++;
		}

		return cnt;
	}

}
