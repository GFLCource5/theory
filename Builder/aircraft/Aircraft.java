package Builder.aircraft;

import Builder.components.*;

public class Aircraft {

    private final AircraftType aircraftType;
    private final Engine engine;
    private final OnBoardComputer onBoardComputer;
    private final Weapon weapon;
    private final FuelTank fuelTank;
    private final Autopilot autopilot;

    public Aircraft(AircraftType aircraftType, Engine engine, Weapon weapon,
                    FuelTank fuelTank, OnBoardComputer onBoardComputer, Autopilot autopilot) {
        this.aircraftType = aircraftType;
        this.engine = engine;
        this.weapon = weapon;
        this.fuelTank = fuelTank;
        this.onBoardComputer = onBoardComputer;
        this.autopilot = autopilot;

        if (this.autopilot != null) {
            this.autopilot.setAircraft(this);
        }
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public double getFuel() {
        return fuelTank.getFuel();
    }

    public void setFuel(double fuel) {
        fuelTank.setFuel(fuel);
    }

    public Engine getEngine() {
        return engine;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public OnBoardComputer getOnBoardComputer() {
        return onBoardComputer;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }
}
