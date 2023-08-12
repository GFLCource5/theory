package AbstractFactory.factories;

import AbstractFactory.service.MathService;
import AbstractFactory.service.PrintService;
import AbstractFactory.service.ThinksService;

public abstract class LanguageAbstractFactory {

    public PrintService print() {
        PrintService printService = createPrintService();
        printService.print();
        return printService;
    }

    public MathService math() {
        MathService mathService = createMathService();
        mathService.math();
        return mathService;
    }

    public ThinksService thinks() throws InterruptedException {
        ThinksService thinksService = createThinksService();
        thinksService.thinks();
        return thinksService;
    }

    abstract PrintService createPrintService();

    abstract MathService createMathService();

    abstract ThinksService createThinksService();
}
