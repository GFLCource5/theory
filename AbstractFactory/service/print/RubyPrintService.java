package AbstractFactory.service.print;

import AbstractFactory.service.PrintService;

public class RubyPrintService implements PrintService {
    @Override
    public void print() {
        System.out.println("Ruby print.");
    }
}
