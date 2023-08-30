package Proxy.proxy;

import Proxy.object.HtmlMessage;
import Proxy.object.Message;

public class MessageProxy implements Message {

    private final String TEXT;
    private HtmlMessage htmlMessage;

    public MessageProxy(String text) {
        this.TEXT = text;
    }

    @Override
    public void print() {
        if (htmlMessage == null) {
            htmlMessage = new HtmlMessage(TEXT);
        }
        htmlMessage.print();
    }
}
