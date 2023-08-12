package AbstractFactory.service.thinks;

import AbstractFactory.service.ThinksService;

public class PythonThinksService implements ThinksService {
    @Override
    public void thinks() throws InterruptedException {
        System.out.println("Python thinks.");
        Thread.sleep(3000);
    }
}
