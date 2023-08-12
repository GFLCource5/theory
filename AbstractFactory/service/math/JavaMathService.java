package AbstractFactory.service.math;

import AbstractFactory.service.MathService;

public class JavaMathService implements MathService {
    @Override
    public void math() {
        System.out.println("Java math.");
    }
}
