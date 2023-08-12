package AbstractFactory.service.thinks;

import AbstractFactory.service.ThinksService;

public class RubyThinksService implements ThinksService {
    @Override
    public void thinks() throws InterruptedException {
        System.out.println("Ruby thinks.");
        Thread.sleep(2000);
    }
}
