// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/*package frc.robot.commands;

import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;

  public class IntakePower extends Command {
    private final IntakeSubsystem m_subsystem;
    private final XboxController m_controller;

    public IntakePower(IntakeSubsystem subsystem, XboxController controller) {
      m_subsystem = subsystem;
      m_controller = controller;
      addRequirements(subsystem);
    }

    @Override
    public void execute() {
      double leftTrigger = m_controller.getLeftTriggerAxis();
      double rightTrigger = m_controller.getRightTriggerAxis();
      double intakePower = leftTrigger - rightTrigger;
      m_subsystem.setIntakePower(intakePower);
    }

    @Override
    public boolean isFinished() {
      return false;
    }
  }*/