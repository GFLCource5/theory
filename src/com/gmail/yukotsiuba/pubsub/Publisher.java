package com.gmail.yukotsiuba.pubsub;

public interface Publisher {
    void subscribe(Subscriber subscriber);

    void unSubscribe(Subscriber subscriber);

    void sendMessage();
}
