package Proxy.object;

public class HtmlMessage implements Message{

    private final String TEXT;

    public HtmlMessage(String text) {
        this.TEXT = text;
        printMessage();
    }

    private void printMessage() {
        System.out.println("HtmlMessage: " + TEXT);
    }

    @Override
    public void print() {
        System.out.println("Message: " + TEXT);
    }
}
