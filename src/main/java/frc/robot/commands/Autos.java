package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {

  public static CommandBase exampleAuto() {
    return Commands.sequence();
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
