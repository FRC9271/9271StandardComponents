package frc.drive;

import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.RobotNumbers;

import frc.controllers.XBoxController;

import java.io.IOException;

import frc.util.Logger;
//import frc.util.Permalogger;

import java.lang.Math;

public class Driver{
    private Logger logger = new Logger("drive");
    private Logger posLogger = new Logger("positions");
    
    private XBoxController controller;

    public Driver(){
        
        //headControl = new PIDController(Kp, Ki, Kd);
    }

    /**
     * Initialize the Driver object.
     */
    public void init(){
        //initialize controller
        //initialize motors
        //initialize pids
        //initialize shifter solenoid(if applicable)
        //initialize vision
        //set leaders/followers and inversions up
        //initialize imu
        //do whatever else you want to do on robot boot (set pid, etc)
    }

    public void setCurrentLimits(double limit){
        //set current limits of all motors, can be useful
    }

    /**
     * Meant to be run during all periodic modes except robotPeriodic().
     */
    public void updateGeneric(){
        //do stuff you always want to be doing, like update robot position and log data or send info to dashboard
    }

    /**
     * Update the Driver object(for teleop mode).
     */
    public void updateTeleop(){
        updateGeneric();
        //do all your teleop drive stuff
        double turn = -controller.getStickRX();
        double forward;
        forward = controller.getStickLY();
        drive(forward, turn);
    }

    public void updateTest(){
        updateGeneric();
        //do whatever you want to do in test mode
        //stuf like log position on a button presse(useful for getting auton location points)
    }

    

    /**
     * Drive each side based on inputs -1 to 1.
     */
    private void drive(double forward, double rotation){ 
        //do stuff to turn the wheels and drive the robot
    }

    /**
     * Set P, I, and D values for the drivetrain.
     */
    private void setPID(double P, double I, double D, double F){
        //set whatever drive PID stuff you may need to set
    }

    /**
     * Set braking
     * @param brake 
     */
    public void setBrake(boolean brake){
        //set all your motors to braking mode or coasting mode 
    }

    public void unlockWheels(){
        //little utility function, useful to run when disabling the robot to set their speeds to 0 and disable braking
        setBrake(false);
    }
    
    /**
     * close all loggers
     */
    public void closeLogger(){
        //odo.writeData(odoData);
        //odo.close();
        logger.close();
        posLogger.close();
    }
}