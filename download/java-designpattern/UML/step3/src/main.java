public interface ToDo {
	void eat();
	void sleep();
}

public class Person implements ToDo {
	//...

	public void eat() {
		System.out.println("밥 먹기");
	}

	public void sleep() {
		System.out.println("잠 자기");
	}
}
