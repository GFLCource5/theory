package Factory.factories;

import Factory.service.PrintService;
import Factory.service.PythonPrintService;

public class PythonFactory extends PrintFactoryService {
    @Override
    PrintService createPrintService() {
        return new PythonPrintService();
    }
}
