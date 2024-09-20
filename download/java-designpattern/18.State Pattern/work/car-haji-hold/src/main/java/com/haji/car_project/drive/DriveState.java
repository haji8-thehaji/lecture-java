package com.haji.car_project.drive;

import com.haji.car_project.drive.state.Gear;

public interface DriveState {
	public void drive_hold(Gear gear);
	public void revarse_hold(Gear gear);
	public void parking_hold(Gear gear);
}
