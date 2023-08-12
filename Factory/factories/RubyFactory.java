package Factory.factories;

import Factory.service.PrintService;
import Factory.service.RubyPrintService;

public class RubyFactory extends PrintFactoryService {
    @Override
    PrintService createPrintService() {
        return new RubyPrintService();
    }
}
