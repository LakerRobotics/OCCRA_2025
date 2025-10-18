// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class IntakeSubsystem extends SubsystemBase {
 CANSparkMax IntakeMotorLeft = new CANSparkMax (50, MotorType.kBrushed);
 CANSparkMax IntakeMotorRight = new CANSparkMax(43, MotorType.kBrushed);

  public IntakeSubsystem() {
    IntakeMotorLeft.setIdleMode(CANSparkMax.IdleMode.kBrake);
    IntakeMotorRight.setIdleMode(CANSparkMax.IdleMode.kBrake);
    IntakeMotorRight.setInverted(true);
  }

  public void setIntakePower(double motorPower) {
    IntakeMotorLeft.set(motorPower);
    IntakeMotorRight.set(motorPower);
  }

}