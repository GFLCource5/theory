package Builder;

import Builder.aircraft.Aircraft;
import Builder.aircraft.AircraftManual;
import Builder.builders.AircraftBuilder;
import Builder.builders.AircraftManualBuilder;
import Builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Aircraft aircraft = exampleOfCreatingAircraft();
        System.out.println("Aircraft build:\n" + aircraft.getAircraftType());
        exampleUsingAircraft(aircraft);

        AircraftManual aircraftManual = exampleOfCreationgAircraftManual();
        System.out.println("\nAircraft manual built: " + aircraftManual.print());
    }

    private static Aircraft exampleOfCreatingAircraft() {
        Director director = new Director();
        AircraftBuilder aircraftBuilder = new AircraftBuilder();
        director.constructFighterInterceptor(aircraftBuilder);
        return aircraftBuilder.getResult();
    }

    private static AircraftManual exampleOfCreationgAircraftManual() {
        Director director = new Director();
        AircraftManualBuilder aircraftManualBuilder = new AircraftManualBuilder();
        director.constructTransport(aircraftManualBuilder);
        return aircraftManualBuilder.getResult();
    }

    private static void exampleUsingAircraft(Aircraft aircraft) {
        System.out.println("\nAircraft fuel level: " + aircraft.getFuel());
        aircraft.setFuel(1300);
        System.out.println("Aircraft fuel level: " + aircraft.getFuel());
        aircraft.getEngine().on();
        System.out.println("Engine is started: " + aircraft.getEngine().isStarted());
    }
}
