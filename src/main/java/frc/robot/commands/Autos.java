// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveTrain;
import frc.robot.commands.DriveTrainFowards;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {
  /** Example static factory for an autonomous command. */
  /*public static Command exampleAuto(ArmSubsystem subsystem) {
    return Commands.sequence(subsystem.exampleMethodCommand(), new ArmPower(subsystem));
  }*/

  public static Command driveForwardAuto(DriveTrain driveTrain) {
    return Commands.sequence(
    new DriveTrainFowards (driveTrain).withTimeout(2.5),

    //Robot stops
    Commands.runOnce(() -> driveTrain.arcadeDrive(0, 0), driveTrain)
    );
  }

 public static Command driveForwardAutoAndTurn(DriveTrain driveTrain) {
    return Commands.sequence(
      
    new DriveTrainFowards (driveTrain).withTimeout(2.5),
    //Turn code TEST ASAP -Hailey
    Commands.runOnce(() -> driveTrain.arcadeDrive(0, 0.5), driveTrain).withTimeout(0),

    //Robot stops
    Commands.runOnce(() -> driveTrain.arcadeDrive(0, 0), driveTrain)
    );
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
} 
