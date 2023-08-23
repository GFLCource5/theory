package Publisher;

import Publisher.listeners.EmailNotificationListener;
import Publisher.listeners.LogOpenListener;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenListener("LogOpenListener.txt"));
        editor.eventManager.subscribe("save", new EmailNotificationListener("email@email.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception exception) {
            System.out.println(exception);
        }

        editor.eventManager.print();
    }
}
