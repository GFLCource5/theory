package Proxy;

import Proxy.object.Message;
import Proxy.proxy.MessageProxy;

public class Main {

    public static void main(String[] args) {
        Message message = new MessageProxy("Some text.");
        message.print();
    }
}
