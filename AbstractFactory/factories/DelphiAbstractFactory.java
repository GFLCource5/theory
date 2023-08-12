package AbstractFactory.factories;

import AbstractFactory.service.MathService;
import AbstractFactory.service.PrintService;
import AbstractFactory.service.ThinksService;
import AbstractFactory.service.math.DelphiMathService;
import AbstractFactory.service.print.DelphiPrintService;
import AbstractFactory.service.thinks.DelphiThinksService;

public class DelphiAbstractFactory extends LanguageAbstractFactory {
    @Override
    PrintService createPrintService() {
        return new DelphiPrintService();
    }

    @Override
    MathService createMathService() {
        return new DelphiMathService();
    }

    @Override
    ThinksService createThinksService() {
        return new DelphiThinksService();
    }
}
