package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class NavX extends SubsystemBase{

    // NAVX
    private final NavX navx = new NavX();


    // CONSTRUCTOR 
    public NavX(){}


    // PERIODIC
    @Override 
    public void periodic(){}
    
    
    // RETURN YAW
    public double getYaw(){
        return navx.getYaw();
    }

    // RETURN ROLL
    public double getRoll(){
        return navx.getRoll();
    }

    // RETURN PITCH
    public double getPitch(){
        return navx.getPitch();
    }
}
