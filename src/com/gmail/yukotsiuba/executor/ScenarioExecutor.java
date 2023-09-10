package com.gmail.yukotsiuba.executor;

public class ScenarioExecutor {

    public static final int DELAY = 5000;

    public void processScenario(Scenario scenario) throws InterruptedException {
        System.out.println("Processing scenario: " + scenario.getName());
        System.out.println("Current thread: " + Thread.currentThread().getName());
        Thread.sleep(DELAY);
    }
}
