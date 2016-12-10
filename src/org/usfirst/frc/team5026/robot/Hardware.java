package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.DriveMotorGroup;

import edu.wpi.first.wpilibj.Talon;

public class Hardware {
	public PantherJoystick driveStick;
	
	public DriveMotorGroup leftDrive;
	public DriveMotorGroup rightDrive;
	

	public Hardware() {
		driveStick = new PantherJoystick(Constants.JOYSTICK_PORT);
		
		leftDrive = new DriveMotorGroup(new Talon(Constants.LEFT_DRIVE_MOTOR_1), new Talon(Constants.LEFT_DRIVE_MOTOR_2), new Talon(Constants.LEFT_DRIVE_MOTOR_3), true);
		rightDrive = new DriveMotorGroup(new Talon(Constants.RIGHT_DRIVE_MOTOR_1), new Talon(Constants.RIGHT_DRIVE_MOTOR_2), new Talon(Constants.RIGHT_DRIVE_MOTOR_3), true);
	}
}

