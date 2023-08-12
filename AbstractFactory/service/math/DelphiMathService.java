package AbstractFactory.service.math;

import AbstractFactory.service.MathService;

public class DelphiMathService implements MathService {
    @Override
    public void math() {
        System.out.println("Delphi math.");
    }
}
