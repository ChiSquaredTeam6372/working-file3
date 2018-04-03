package org.usfirst.frc.team6372.robot;

import edu.wpi.first.wpilibj.Spark;

public class Tray {

private Spark Tray;
	
	public Tray(Spark Tray){
		this.Tray = Tray;
	}
	
//	public void extendTray(boolean b){
//		Tray.set(-b * Constants.MAX_DRIVE_SPEED_TRAY);
	
//	public void retractTray(double speed){
//		Tray.set(speed * Constants.MAX_DRIVE_SPEED_TRAY);
	
	//Spark Elevator = new Spark(Constants.TALON_C_PORT);

public void retractTray(double speed){
	
	Tray.set(speed);
	
}
public void extendTray(double speed){
	
	Tray.set(-speed);
	
}
	

}
