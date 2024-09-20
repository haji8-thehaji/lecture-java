package com.haji.car_project.drive.state;

import com.haji.car_project.drive.DriveState;
import com.haji.car_project.drive.state.type.*;

public class Gear {
    
	private DriveState state = DRIVE.getInstance();
	public void setState(DriveState state) {
		this.state = state;
	}
	public void drive_hold() {
		state.drive_hold(this);
	}
	public void revarse_hold() {
		state.revarse_hold(this);
	}
	public void parking_hold() {
		state.parking_hold(this);
	}
}
