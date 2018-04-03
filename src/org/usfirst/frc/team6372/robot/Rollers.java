package org.usfirst.frc.team6372.robot;

import edu.wpi.first.wpilibj.VictorSP;
import org.usfirst.frc.team6372.robot.Constants;

public class Rollers {

	private VictorSP LeftRoller, RightRoller;

	public Rollers(VictorSP LeftRoller, VictorSP RightRoller) {

		this.LeftRoller = LeftRoller;
		this.RightRoller = RightRoller;
	}

	public void getCube(double tre) {

		LeftRoller.set(tre * Constants.MAX_DRIVE_SPEED_LEFTROLLER);
		RightRoller.set(-tre * Constants.MAX_DRIVE_SPEED_RIGHTROLLER);
		// Tray.set(e * Constants.MAX_DRIVE_SPEED_EXTEND);
	}

	public void spitCube(double tr) {

		LeftRoller.set(-tr * Constants.MAX_DRIVE_SPEED_LEFTROLLER);
		RightRoller.set(tr * Constants.MAX_DRIVE_SPEED_RIGHTROLLER);
																	
																	
	}

}
