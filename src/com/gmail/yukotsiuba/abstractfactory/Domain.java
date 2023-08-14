package com.gmail.yukotsiuba.abstractfactory;

public class Domain {
    public static void main(String[] args) {
        AbstractFactory factory = getFactory(Projects.JAVA.getProjectType());

        Developer developer = factory.createDeveloper();
        Automation automationEngineer = factory.createAutomationEngineer();

        developer.writeCode();
        automationEngineer.automate();
    }

    private static AbstractFactory getFactory(String projectType) {
        switch (projectType) {
            case "java":
                return new JavaFactory();
            case  "python":
                return new PythonFactory();
            default:
                throw new UnsupportedOperationException("No such project type " + projectType);
        }
    }
}

enum Projects {
    JAVA("java"),
    PYTHON("python");

    private String projectType;

    Projects(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectType() {
        return projectType;
    }
}
