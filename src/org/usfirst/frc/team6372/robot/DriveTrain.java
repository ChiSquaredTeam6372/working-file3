package org.usfirst.frc.team6372.robot;

//import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.XboxController;

public class DriveTrain {

	XboxController xbc = new XboxController(0);

	Spark left1 = new Spark(Constants.TALON_L1_PORT);
	Spark left2 = new Spark(Constants.TALON_L2_PORT);
	Spark right1 = new Spark(Constants.TALON_R1_PORT);
	Spark right2 = new Spark(Constants.TALON_R2_PORT);
	Spark Elevator = new Spark(Constants.TALON_C_PORT);
	Spark Tray = new Spark(Constants.TALON_EX_PORT);
	//Spark LeftRoller = new Spark(Constants.TALON_RL_PORT);
	//Spark RightRoller = new Spark(Constants.TALON_RR_PORT);

	public void drive(double left, double right, double turn) {
		left1.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
		left2.set(left * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
		right1.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);
		right2.set(-right * Constants.MAX_DRIVE_SPEED + turn * Constants.MAX_TURN_SPEED);

	}

//		//tre is variable for speed, -tre is backwards
//	public void drive1(double tre) {
//		LeftRoller.set(tre * Constants.MAX_DRIVE_SPEED_LEFTROLLER);
//		RightRoller.set(-tre * Constants.MAX_DRIVE_SPEED_RIGHTROLLER);
//
//	}
//	
//	public void drive2(double tr) {
//		LeftRoller.set(-tr * Constants.MAX_DRIVE_SPEED_LEFTROLLER);
//		RightRoller.set(tr * Constants.MAX_DRIVE_SPEED_RIGHTROLLER);
//	}

	public void drive3(double re, double de) {
		Elevator.set(-re * Constants.MAX_DRIVE_SPEED_ELEVATOR);

	}

//	public void retractTray(double speed){
//		
//		Tray.set(speed);
//		
//	}
//	public void extendTray(double speed){
//		
//		Tray.set(-speed);
//	
//	}


}