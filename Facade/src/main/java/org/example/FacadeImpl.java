package org.example;

public class FacadeImpl implements FacadeCleverHouse {

  private AirConditioner conditioner;
  private Light light;
  private RobotVacuumCleaner robot;

  public FacadeImpl(AirConditioner conditioner, Light light, RobotVacuumCleaner robot) {
    this.conditioner = conditioner;
    this.light = light;
    this.robot = robot;
  }

  public void turnOn() {
    conditioner.turnOn();
    robot.startCleaning();
    light.turnOn();
  }

  public void turnOff() {
    light.turnOff();
    conditioner.turnOff();
    robot.stopCleaning();
  }
}
