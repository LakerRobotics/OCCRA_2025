// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.Autos;
import frc.robot.commands.ArmPower;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.ArmSubsystem;
//import frc.robot.subsystems.ClimbSubsystem;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  private final static DriveTrain m_driveTrain = new DriveTrain();;// The robot's subsystems and commands are defined here...
  private final static ArmSubsystem m_Armsubsystem = new ArmSubsystem();
  private final static RobotContainer m_robotContainer = new RobotContainer(); 
  //private final static ClimbSubsystem m_Climbsubsystem = new ClimbSubsystem();    
  
  // Replace with CommandXboxController or CommandJoystick if needed
  private final XboxController m_driverController =
      new XboxController(frc.robot.Constants.DriveTrainConstants.OperatorConstants.kDriverControllerPort);
  
  private final XboxController m_opController =
      new XboxController(1);

   // A chooser for autonomous commands
   SendableChooser<Command> m_chooser = new SendableChooser<>();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
  //  m_driveTrain = 
    // Configure the trigger bindings
    //configureBindings();

    //SETUP AUTONOMOUS CODE
    configureAutos();
  }
  
  public static RobotContainer getInstance() {
    return m_robotContainer;
  }
  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
 // private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    //new Trigger(m_exampleSubsystem::exampleCondition)
    //    .onTrue(new ExampleCommand(m_exampleSubsystem));

    // Schedule `exampleMethodCommand` when the controller's triangle button is pressed,
    // cancelling on release.
   // m_driverController.getLeftY()(m_exampleSubsystem.exampleMethodCommand());
 // }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand()
   {
    return m_chooser.getSelected();
    // An example command will be run in autonomous

  }

  private void configureAutos() {
    SmartDashboard.putData("auton chooser",m_chooser); 
    m_chooser.setDefaultOption("Drive Forward", Autos.driveForwardAuto(m_driveTrain));
    m_chooser.addOption("Drive Forward and Turn", Autos.driveForwardAutoAndTurn(m_driveTrain));
  }
  
  public XboxController getDriverController() {
    // TODO Auto-generated method stub
   // throw new UnsupportedOperationException("Unimplemented method 'getDriverController'");
   return m_driverController;
  }

  public XboxController getOperatorController() {
    return m_opController;
  }

  public DriveTrain getDriveTrain(){
    return m_driveTrain;
  }

 public ArmSubsystem getArmSubsystem(){
    return m_Armsubsystem;
  }




 // public ClimbSubsystem getClimbSubsystem() {
//    return m_Climbsubsystem;
 // }

}
