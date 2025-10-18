// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class IntakeSubsystem extends SubsystemBase {
 private  CANSparkMax intakeMotorLeft;
 private CANSparkMax intakeMotorRight;
 //private MotorControllerGroup intakeMotorGroup;
 private DifferentialDrive intakeDrive;

 public IntakeSubsystem() {
  // Initialize individual motors
  intakeMotorLeft = new CANSparkMax(52, MotorType.kBrushed);
  intakeMotorRight = new CANSparkMax(51, MotorType.kBrushed);

  // Configure motor settings
  intakeMotorLeft.setIdleMode(CANSparkMax.IdleMode.kBrake);
  intakeMotorRight.setIdleMode(CANSparkMax.IdleMode.kBrake);
  intakeMotorRight.setInverted(true);

  // Create differential drive for arcade-style control
  intakeDrive = new DifferentialDrive(intakeMotorLeft, intakeMotorRight);

  // Group motors together for synchronized control
  //intakeMotorGroup = new MotorControllerGroup(intakeMotorLeft, intakeMotorRight);
}

public void intakeArcadeDrive(double intakePower, double rotationPower) {
  boolean squareInputs = true;
  intakeDrive.arcadeDrive(intakePower, rotationPower, squareInputs);
}

public void stopIntake() {
  intakeDrive.arcadeDrive(0, 0);
}

/*public void setIntakePower(double motorPower) {
  intakeMotorGroup.set(motorPower);
}

public void stopIntake() {
  intakeMotorGroup.set(0);
}*/

}