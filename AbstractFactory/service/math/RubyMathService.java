package AbstractFactory.service.math;

import AbstractFactory.service.MathService;

public class RubyMathService implements MathService {

    @Override
    public void math() {
        System.out.println("Ruby math.");
    }
}
