// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.spark.SparkAbsoluteEncoder;

public class ArmSubsystem extends SubsystemBase {
  private SparkMax armMotor1 = new SparkMax(50, MotorType.kBrushless);
  private SparkMax armMotor2 = new SparkMax(39, MotorType.kBrushless);
  private AbsoluteEncoder armEncoder;
  /** Creates a new ExampleSubsystem. */
  
  public ArmSubsystem() {
    //armMotor1.setIdleMode(SparkMax.IdleMode.kBrake); 
   // armMotor2.setIdleMode(SparkMax.IdleMode.kBrake);
    armMotor2.setInverted(true);
    armEncoder = armMotor1.getAbsoluteEncoder();
    //armEncoder.setPositionConversionFactor(1.0);
    //armEncoder.setInverted(false);
  }

  /*
   * Example command factory method.
   *
   * @return a command
   
   public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
 /*       });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Arm Position", getArmPosition());
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void setArmPower(double motorPower){
    armMotor1.set(motorPower*0.1);
    armMotor2.set(motorPower*0.1);
  }

  public double getArmPosition() {
    return armEncoder.getPosition();
  }

 // public void setArmZeroOffset() {
 //   armEncoder.setZeroOffset(armEncoder.getPosition());
 // }

  public boolean isArmAtPosition(double targetPosition, double tolerance) {
    double currentPosition = getArmPosition();
    return Math.abs(currentPosition - targetPosition) <= tolerance;
  } 

} 
