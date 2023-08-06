package Builder.director;

import Builder.aircraft.AircraftType;
import Builder.builders.Builder;
import Builder.components.*;

public class Director {

    public void constructLightBomber(Builder builder) {
        builder.setAircraftType(AircraftType.BOMBER);
        builder.setEngine(Engine.SCREW_AIRCRAFT_ENGINE);
        builder.setFuelTank(FuelTank.STANDARD_ALUMINUM_CANS);
        builder.setOnBoardComputer(new OnBoardComputer());
        builder.setWeapon(Weapon.BOMB_ARMAMENT);
        builder.setAutopilot(new Autopilot());
    }

    public void constructFighterInterceptor(Builder builder) {
        builder.setAircraftType(AircraftType.FIGHTER);
        builder.setEngine(Engine.JET_AIRCRAFT_ENGINE);
        builder.setFuelTank(FuelTank.AIRPLANE_WING);
        builder.setOnBoardComputer(new OnBoardComputer());
        builder.setWeapon(Weapon.CANNON_ARMAMENT);
    }

    public void constructTransport(Builder builder) {
        builder.setAircraftType(AircraftType.TRANSPORT);
        builder.setEngine(Engine.COMBINED_AIRCRAFT_ENGINE);
        builder.setFuelTank(FuelTank.SUSPENDED);
        builder.setOnBoardComputer(new OnBoardComputer());
        builder.setWeapon(Weapon.SPECIAL_ARMAMENT);
        builder.setAutopilot(new Autopilot());
    }
}