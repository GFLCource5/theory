package Builder.components;

public enum Engine {
    SCREW_AIRCRAFT_ENGINE,
    JET_AIRCRAFT_ENGINE,
    COMBINED_AIRCRAFT_ENGINE;

    private double mileage;
    private boolean started;

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.out.println("Cannot go(), you must start engine first.");
        }
    }

    public double getMileage() {
        return mileage;
    }
}
