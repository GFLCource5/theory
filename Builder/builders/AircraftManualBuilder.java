package Builder.builders;

import Builder.aircraft.AircraftManual;
import Builder.aircraft.AircraftType;
import Builder.components.*;

public class AircraftManualBuilder implements Builder {

    private AircraftType aircraftType;
    private Engine engine;
    private OnBoardComputer onBoardComputer;
    private Weapon weapon;
    private FuelTank fuelTank;
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

    public AircraftManual getResult() {
        return new AircraftManual(aircraftType, engine, onBoardComputer, weapon, fuelTank, autopilot);
    }
}
