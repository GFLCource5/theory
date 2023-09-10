package com.gmail.yukotsiuba.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScenarioListener listener = new ScenarioListener();
        ScenarioExecutor scenarioExecutor = new ScenarioExecutor();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10,
                10,
                200L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>()
        );

        ScenarioHandler scenarioHandler = scenario -> {
            executor.execute(() -> {
                try {
                    scenarioExecutor.processScenario(scenario);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

        };
        listener.execute(scenarioHandler);
    }

}
