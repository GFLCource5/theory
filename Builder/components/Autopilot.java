package Builder.components;

import Builder.aircraft.Aircraft;

public class Autopilot {

    private boolean status;
    private Aircraft aircraft;

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void getInfoAboutAircraft() {
        System.out.println("Aircraft: " + aircraft.getAircraftType());
    }

    public void on() {
        status = true;
    }

    public void off() {
        status = false;
    }

    public boolean isStatus() {
        return status;
    }
}
