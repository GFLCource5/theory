package Factory.service;

public class JavaPrintService implements PrintService {
    @Override
    public void print() {
        System.out.println("Java print.");
    }

    @Override
    public void printAnotherInfo() {
        System.out.println("Java another print.");
    }
}
