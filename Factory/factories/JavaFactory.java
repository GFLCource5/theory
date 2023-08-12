package Factory.factories;

import Factory.service.JavaPrintService;
import Factory.service.PrintService;

public class JavaFactory extends PrintFactoryService {
    @Override
    PrintService createPrintService() {
        return new JavaPrintService();
    }
}
