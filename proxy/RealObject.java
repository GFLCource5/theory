package proxy;

public class RealObject implements MyInterface{
    @Override
    public void doSomething(String param) {
        System.out.println("RealObject is doing something with param: " + param);
    }
}
