package Factory;

import Factory.factories.*;

public class ApplicationFactoryMethod {

    private static PrintFactoryService printFactoryService;

    public static void main(String[] args) {
        configuration(Language.JAVA);
        printFactoryService.print();
        printFactoryService.anotherPrint();
    }

    private static void configuration(Language language) {
        switch (language) {
            case JAVA -> printFactoryService = new JavaFactory();
            case PYTHON -> printFactoryService = new PythonFactory();
            case DELPHI -> printFactoryService = new DelphiFactory();
            case RUBY -> printFactoryService = new RubyFactory();
        }
    }
}
