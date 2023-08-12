package AbstractFactory.factories;

import AbstractFactory.service.MathService;
import AbstractFactory.service.PrintService;
import AbstractFactory.service.ThinksService;
import AbstractFactory.service.math.RubyMathService;
import AbstractFactory.service.print.RubyPrintService;
import AbstractFactory.service.thinks.RubyThinksService;

public class RubyAbstractFactory extends LanguageAbstractFactory {
    @Override
    PrintService createPrintService() {
        return new RubyPrintService();
    }

    @Override
    MathService createMathService() {
        return new RubyMathService();
    }

    @Override
    ThinksService createThinksService() {
        return new RubyThinksService();
    }
}
