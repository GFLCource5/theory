package Builder.components;

import Builder.aircraft.Aircraft;

public class OnBoardComputer {

    private Aircraft aircraft;

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + aircraft.getFuel());
    }

    public void showStatus() {
        if (this.aircraft.getEngine().isStarted()) {
            System.out.println("Aircraft is started.");
        } else {
            System.out.println("Aircraft isn't started.");
        }
    }


}
