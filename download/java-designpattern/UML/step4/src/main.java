public class Car {
	private String carNumber;
	private String model;

	public void move() {
		//...
	}
}

public class Person {
	//...

	public void drive(Car car) {
		System.out.println("신나는 드라이브");
		car.move();
	}
}
