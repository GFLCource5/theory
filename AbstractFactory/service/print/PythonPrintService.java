package AbstractFactory.service.print;

import AbstractFactory.service.PrintService;

public class PythonPrintService implements PrintService {
    @Override
    public void print() {
        System.out.println("Python print.");
    }
}
