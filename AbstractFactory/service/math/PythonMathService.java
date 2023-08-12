package AbstractFactory.service.math;

import AbstractFactory.service.MathService;

public class PythonMathService implements MathService {
    @Override
    public void math() {
        System.out.println("Python math.");
    }
}
