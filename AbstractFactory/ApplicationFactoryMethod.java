package AbstractFactory;

import AbstractFactory.factories.*;

public class ApplicationFactoryMethod {

    private static LanguageAbstractFactory languageAbstractFactory;

    public static void main(String[] args) throws InterruptedException {
        configuration(Language.RUBY);
        languageAbstractFactory.print();
        languageAbstractFactory.thinks();
        languageAbstractFactory.math();
    }

    private static void configuration(Language language) {
        switch (language) {
            case JAVA -> languageAbstractFactory = new JavaAbstractFactory();
            case PYTHON -> languageAbstractFactory = new PythonAbstractFactory();
            case DELPHI -> languageAbstractFactory = new DelphiAbstractFactory();
            case RUBY -> languageAbstractFactory = new RubyAbstractFactory();
        }
    }
}
