package AbstractFactory.service.print;

import AbstractFactory.service.PrintService;

public class DelphiPrintService implements PrintService {
    @Override
    public void print() {
        System.out.println("Delphi print.");
    }
}
