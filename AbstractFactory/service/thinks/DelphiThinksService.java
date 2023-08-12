package AbstractFactory.service.thinks;

import AbstractFactory.service.ThinksService;

public class DelphiThinksService implements ThinksService {
    @Override
    public void thinks() throws InterruptedException {
        System.out.println("Delphi thinks.");
        Thread.sleep(1000);
    }
}
