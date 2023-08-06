package Builder.builders;

import Builder.aircraft.AircraftType;
import Builder.components.*;

public interface Builder {

    void setAircraftType(AircraftType aircraftType);

    void setEngine(Engine engine);

    void setFuelTank(FuelTank fuelTank);

    void setOnBoardComputer(OnBoardComputer onBoardComputer);

    void setWeapon(Weapon weapon);

    void setAutopilot(Autopilot autopilot);
}