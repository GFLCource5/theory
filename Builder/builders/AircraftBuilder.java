package Builder.builders;

import Builder.aircraft.Aircraft;
import Builder.aircraft.AircraftType;
import Builder.components.*;

public class AircraftBuilder implements Builder {

    private AircraftType aircraftType;
    private Engine engine;
    private FuelTank fuelTank;
    private OnBoardComputer onBoardComputer;
    private Weapon weapon;
    private Autopilot autopilot;

    @Override
    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public void setOnBoardComputer(OnBoardComputer onBoardComputer) {
        this.onBoardComputer = onBoardComputer;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void setAutopilot(Autopilot autopilot) {
        this.autopilot = autopilot;
    }

    public Aircraft getResult() {
        return new Aircraft(aircraftType, engine, weapon, fuelTank, onBoardComputer, autopilot);
    }
}
