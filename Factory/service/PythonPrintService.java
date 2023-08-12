package Factory.service;

public class PythonPrintService implements PrintService {
    @Override
    public void print() {
        System.out.println("Python print.");
    }

    @Override
    public void printAnotherInfo() {
        System.out.println("Python another print.");
    }
}
