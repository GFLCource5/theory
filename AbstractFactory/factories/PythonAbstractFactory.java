package AbstractFactory.factories;

import AbstractFactory.service.MathService;
import AbstractFactory.service.PrintService;
import AbstractFactory.service.ThinksService;
import AbstractFactory.service.math.PythonMathService;
import AbstractFactory.service.print.PythonPrintService;
import AbstractFactory.service.thinks.PythonThinksService;

public class PythonAbstractFactory extends LanguageAbstractFactory {
    @Override
    PrintService createPrintService() {
        return new PythonPrintService();
    }

    @Override
    MathService createMathService() {
        return new PythonMathService();
    }

    @Override
    ThinksService createThinksService() {
        return new PythonThinksService();
    }
}
