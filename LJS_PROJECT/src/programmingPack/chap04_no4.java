package programmingPack;

class Car {
	private String color;
	private static int carNum = 0, redcarNum = 0;

	public Car(String color) {
		this.color = color;
		carNum++;

		// 문자열 객체 비교는 메서드 사용해야된다 (==연산자 사용 불가)
		if (color.equalsIgnoreCase("red"))
			redcarNum++;
	}

	// 정적 변수 or 정적 메서드는 this. 키워드 쓰면 오류난다!!
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

		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}

}
