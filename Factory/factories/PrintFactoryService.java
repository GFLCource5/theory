package Factory.factories;

import Factory.service.PrintService;

public abstract class PrintFactoryService {

    public PrintService print() {
        PrintService printService = createPrintService();
        printService.print();
        return printService;
    }

    public PrintService anotherPrint() {
        PrintService printService = createPrintService();
        printService.printAnotherInfo();
        return printService;
    }

    abstract PrintService createPrintService();
}
