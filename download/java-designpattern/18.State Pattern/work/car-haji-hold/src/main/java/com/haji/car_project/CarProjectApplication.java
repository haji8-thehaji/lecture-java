package com.haji.car_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.haji.car_project.drive.state.Gear;

@SpringBootApplication
public class CarProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarProjectApplication.class, args);
		Gear gear = new Gear();
		gear.drive_hold();
		gear.revarse_hold();
		gear.parking_hold();
		gear.revarse_hold();
		gear.drive_hold();

	}

}
