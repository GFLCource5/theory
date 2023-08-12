package Factory.service;

public class RubyPrintService implements PrintService {

    @Override
    public void print() {
        System.out.println("Ruby print.");
    }

    @Override
    public void printAnotherInfo() {
        System.out.println("Ruby another print.");
    }
}
