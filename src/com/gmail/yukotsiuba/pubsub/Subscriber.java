package com.gmail.yukotsiuba.pubsub;

import java.util.List;

public interface Subscriber {

    void onMessageReceived(Shop shop, Message message);
}
