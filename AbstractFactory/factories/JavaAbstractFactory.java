package AbstractFactory.factories;

import AbstractFactory.service.MathService;
import AbstractFactory.service.PrintService;
import AbstractFactory.service.ThinksService;
import AbstractFactory.service.math.JavaMathService;
import AbstractFactory.service.print.JavaPrintService;
import AbstractFactory.service.thinks.JavaThinksService;

public class JavaAbstractFactory extends LanguageAbstractFactory {
    @Override
    PrintService createPrintService() {
        return new JavaPrintService();
    }

    @Override
    MathService createMathService() {
        return new JavaMathService();
    }

    @Override
    ThinksService createThinksService() {
        return new JavaThinksService();
    }
}
