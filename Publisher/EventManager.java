package Publisher;

import Publisher.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }

    public void print() {
        for (Map.Entry<String, List<EventListener>> event : listeners.entrySet()) {
            String key = event.getKey();
            List<EventListener> eventListeners = event.getValue();

            System.out.println("Key: " + key);
            for (EventListener listener : eventListeners) {
                System.out.println(listener.toString());
            }
        }
    }
}
