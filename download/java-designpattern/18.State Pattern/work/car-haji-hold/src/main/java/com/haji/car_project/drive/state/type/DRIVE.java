package com.haji.car_project.drive.state.type;

import com.haji.car_project.drive.DriveState;
import com.haji.car_project.drive.state.Gear;

public class DRIVE implements DriveState {

	private static DriveState instance = new DRIVE();
	
	public static DriveState getInstance() {
		return instance;
	}
	@Override
	public void drive_hold(Gear gear){
		System.out.println("go go go");
		gear.setState(DRIVE.getInstance());
    }
	@Override
	public void revarse_hold(Gear gear){
		System.out.println("go back");
		gear.setState(REVERSE.getInstance());
    }
	@Override
	public void parking_hold(Gear gear){
		System.out.println("stop");
		gear.setState(PARKING.getInstance());

    }
}
