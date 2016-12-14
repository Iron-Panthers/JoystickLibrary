package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.DriveMotorGroup;

import edu.wpi.first.wpilibj.Talon;

public class Hardware {
	public PantherJoystick driveStick;
	
	public DriveMotorGroup leftDrive;
	public DriveMotorGroup rightDrive;
	

	public Hardware() {
		driveStick = new PantherJoystick(Constants.JOYSTICK_PORT);
		
		leftDrive = new DriveMotorGroup(new Talon(RobotMap.leftDriveMotor1), new Talon(RobotMap.leftDriveMotor2), new Talon(RobotMap.leftDriveMotor3), true);
		rightDrive = new DriveMotorGroup(new Talon(RobotMap.rightDriveMotor1), new Talon(RobotMap.rightDriveMotor2), new Talon(RobotMap.rightDriveMotor3), true);
	}
}

