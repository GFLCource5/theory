package com.example.pubsub;

import com.example.pubsub.publisher.ContactSensor;
import com.example.pubsub.publisher.Sensor;
import com.example.pubsub.publisher.SmokeSensor;
import com.example.pubsub.publisher.WeatherSensor;
import com.example.pubsub.subscriber.Alarm;
import com.example.pubsub.subscriber.LightSwitch;
import com.example.pubsub.subscriber.SecurityReceiver;
import com.example.pubsub.subscriber.UserReceiver;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        new UserReceiver(Topic.INFO, Topic.EVENT, Topic.ALARM);
        new SecurityReceiver(Topic.EVENT, Topic.ALARM);
        new Alarm(Topic.ALARM);
        new LightSwitch(Topic.EVENT);

        Sensor weatherSensor = new WeatherSensor(Topic.INFO);
        Sensor smokeSensor = new SmokeSensor(Topic.ALARM);
        Sensor contactSensor = new ContactSensor(Topic.EVENT);

        List<Sensor> sensors = new ArrayList<>(List.of(weatherSensor, smokeSensor, contactSensor));

        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Sensor sensor = sensors.get(random(0,2));
            if (sensor.getClass().equals(WeatherSensor.class)) {
                sensor.sendMessage(new Message(
                        "temperature: " + random(-30, 50) + ", humidity: " + random(10, 99)));
                System.out.println();
            } else if (sensor.getClass().equals(SmokeSensor.class)) {
                sensor.sendMessage(new Message("smoke detected"));
                System.out.println();
            } else {
                sensor.sendMessage(new Message(
                        List.of("door opened", "door closed").get(random(0, 1))));
                System.out.println();
            }
        }
    }

    private static int random(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }
}
