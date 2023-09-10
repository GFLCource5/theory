package com.gmail.yukotsiuba.executor;

import java.util.Arrays;
import java.util.List;

public class ScenarioListener {
    public void execute(ScenarioHandler handler) {
        List<Scenario> scenarios = getScenarioList();
        int currentIndex = 0;
        while (true) {
            Scenario scenario = scenarios.get(currentIndex);
            handler.onScenarioProduced(scenario);
            currentIndex = (currentIndex + 1) % scenarios.size();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private List<Scenario> getScenarioList() {
        return Arrays.asList(
                new Scenario("Create_Scenario"),
                new Scenario("Click_Scenario"),
                new Scenario("Check_Scenario"));
    }
}
