package AbstractFactory.service.thinks;

import AbstractFactory.service.ThinksService;

public class JavaThinksService implements ThinksService {
    @Override
    public void thinks() {
        System.out.println("Java thinks.");
    }
}
