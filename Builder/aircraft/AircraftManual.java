package Builder.aircraft;

import Builder.components.*;

public class AircraftManual {

    private final AircraftType aircraftType;
    private final Engine engine;
    private final OnBoardComputer onBoardComputer;
    private final Weapon weapon;
    private final FuelTank fuelTank;
    private final Autopilot autopilot;

    public AircraftManual(AircraftType aircraftType, Engine engine, OnBoardComputer onBoardComputer,
                          Weapon weapon, FuelTank fuelTank, Autopilot autopilot) {
        this.aircraftType = aircraftType;
        this.engine = engine;
        this.weapon = weapon;
        this.fuelTank = fuelTank;
        this.onBoardComputer = onBoardComputer;
        this.autopilot = autopilot;
    }

    public String print() {
        return String.format(
                "\nType of aircraft: %s\nEngine: %s\nWeapon: %s\nFuel Tank: %s\nOn-Board Computer: %s\nAutopilot: %s\n",
                aircraftType,
                engine,
                weapon.getDisplayName(),
                fuelTank,
                onBoardComputer,
                (autopilot != null) ? "Functional" : "N/A"
        );
    }
}
