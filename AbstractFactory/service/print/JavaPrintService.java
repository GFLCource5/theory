package AbstractFactory.service.print;

import AbstractFactory.service.PrintService;

public class JavaPrintService implements PrintService {
    @Override
    public void print() {
        System.out.println("Java print.");
    }
}
