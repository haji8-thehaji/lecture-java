package com.haji.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);

		System.out.println(Dummy.testString);
		Dummy.testString = "modify TestString";
		System.out.println(Dummy.testString);

		Dummy d1 = new Dummy()
		;
		Dummy d2 = new Dummy();
		System.out.println(d1.testString);
		Dummy.testString = "second";
		System.out.println(d2.testString);
		System.out.println(d1.testString);
		System.out.println(Dummy.testString);
	}

}
