package Factory.factories;

import Factory.service.DelphiPrintService;
import Factory.service.PrintService;

public class DelphiFactory extends PrintFactoryService {
    @Override
    PrintService createPrintService() {
        return new DelphiPrintService();
    }
}
