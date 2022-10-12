package programmingPack;

public class chap03_no9 {

	public static void foo(String s, int n) {
		System.out.println(s + " " + 1);
	}

	public static void foo(String s, int n1, int n2) {
		System.out.println(s + " " + n1 + " " + n2);
	}

	public static void foo(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		foo("æ»≥Á", 1);
		foo("æ»≥Á«œººø‰", 1, 2);
		foo("¿ﬂ ¿÷æÓ");
	}

}
