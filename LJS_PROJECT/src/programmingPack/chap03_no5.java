package programmingPack;

public class chap03_no5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y = 1, z = 1;
		for (x = 1; x <= 20; x++) {
			for (y = 1; y <= 20; y++) {

				for (z = 1; z <= 20; z++) {

					if (z == (Math.sqrt(x * x + y * y)) && x + y + z <= 20) {
						System.out.printf("%d %d %d", x, y, z);
						System.out.println();
					}
				}
			}
		}

	}

}
