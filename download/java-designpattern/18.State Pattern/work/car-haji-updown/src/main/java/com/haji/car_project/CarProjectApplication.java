package com.haji.car_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.haji.car_project.drive.state.Gear;

@SpringBootApplication
public class CarProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarProjectApplication.class, args);
		Gear gear = new Gear();
		gear.up_push_button();
		gear.accel();
		gear.up_push_button();
		gear.accel();
		gear.up_push_button();
		gear.accel();
		gear.up_push_button();
		gear.accel();
		gear.down_push_button();
		gear.accel();
		gear.down_push_button();
		gear.accel();
		gear.down_push_button();
		gear.accel();
		gear.down_push_button();
		gear.accel();

	}

}
