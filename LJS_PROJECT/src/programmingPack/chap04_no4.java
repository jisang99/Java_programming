package programmingPack;

class Car {
	private String color;
	private static int carNum = 0, redcarNum = 0;

	public Car(String color) {
		this.color = color;
		carNum++;

		// ���ڿ� ��ü �񱳴� �޼��� ����ؾߵȴ� (==������ ��� �Ұ�)
		if (color.equalsIgnoreCase("red"))
			redcarNum++;
	}

	// ���� ���� or ���� �޼���� this. Ű���� ���� ��������!!
	public static int getNumOfCar() {
		return carNum;
	}

	public static int getNumOfRedCar() {
		return redcarNum;
	}
}

public class chap04_no4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");

		System.out.printf("�ڵ��� �� : %d, ������ �ڵ��� �� : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}

}
