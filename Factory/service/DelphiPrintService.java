package Factory.service;

public class DelphiPrintService implements PrintService {
    @Override
    public void print() {
        System.out.println("Delphi print.");
    }

    @Override
    public void printAnotherInfo() {
        System.out.println("Delphi another print.");
    }
}
