package Builder.components;

public enum FuelTank {
    AIRPLANE_WING(500),
    STANDARD_ALUMINUM_CANS(1000),
    SUSPENDED(800);

    private final double maxFuel;
    private double fuel = 0;

    FuelTank(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        if (fuel <= maxFuel) {
            this.fuel = fuel;
        } else {
            System.out.println("Fuel exceeds maximum capacity.");
            this.fuel = maxFuel;
        }
    }
}
