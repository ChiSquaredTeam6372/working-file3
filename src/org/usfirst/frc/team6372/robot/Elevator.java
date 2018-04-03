package org.usfirst.frc.team6372.robot;

import edu.wpi.first.wpilibj.Spark;

public class Elevator {
	
	private Spark elevatorMotor;
	
	public Elevator(Spark elevatorMotor){
		this.elevatorMotor = elevatorMotor;
	}
	
	public void extendElevator(double speed){
		elevatorMotor.set(-speed * Constants.MAX_DRIVE_SPEED_ELEVATOR);
	}
	public void retractElevator(double speed){
		elevatorMotor.set(speed * Constants.MAX_DRIVE_SPEED_ELEVATOR);
	}
	//Spark Elevator = new Spark(Constants.TALON_C_PORT);

	
}
