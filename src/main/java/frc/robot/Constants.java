// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveTrainConstants {
   // public static final int kLeftMotor1CANID = 19;
   // public static final int kLeftMotor2CANID = 16;
    //public static final int kLeftMotor3CANID = 15;
    //public static final int kRightMotor1CANID = 20;
    //public static final int kRightMotor2CANID = 1; 
    //public static final int kRightMotor3CANID = 2;
    


    //limit Current to avoid drawing batter too low & getting chatter
    public static final int SparkCurrentLimit = 30
    ;
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
 }
  public static final class ArmConstants{
    public static final int armMotorCANID = 12;
  }
}