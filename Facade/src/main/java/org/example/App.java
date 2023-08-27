package org.example;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        FacadeCleverHouse house = getFacadeCleverHouse();
        house.turnOn();
        Thread.currentThread().sleep(3000);
        house.turnOff();
    }

    private static FacadeCleverHouse getFacadeCleverHouse() {
        return new FacadeImpl(new AirConditioner() {
            public void turnOn() {
                System.out.println("Conditioner start work");
            }

            public void turnOff() {
                System.out.println("Conditioner stop work");
            }
        }, new Light() {
            public void turnOn() {
                System.out.println("Let there be light");
            }

            public void turnOff() {
                System.out.println("said the fitter and cut the wires");
            }
        }, new RobotVacuumCleaner() {
            public void startCleaning() {
                System.out.println("Started hunting for dust");
            }

            public void stopCleaning() {
                System.out.println("Bags full of loot, time to go home");
            }
        });

    }
}
