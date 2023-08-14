package com.gmail.yukotsiuba.abstractfactory;

public class PythonFactory implements AbstractFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Automation createAutomationEngineer() {
        return new PythonAutomationEngineer();
    }
}
