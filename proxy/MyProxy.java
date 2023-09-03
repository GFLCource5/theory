package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {
    private final MyInterface realObject;

    public MyProxy(MyInterface realObject) {
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method name: " + method.getName());
        System.out.println("Method parameter: " + args[0]);
        return method.invoke(realObject, args);
    }

    public static void main(String[] args) {
        MyInterface realObject = new RealObject();
        MyInterface proxy = (MyInterface) Proxy.newProxyInstance(
                realObject.getClass().getClassLoader(),
                realObject.getClass().getInterfaces(),
                new MyProxy(realObject));

        proxy.doSomething("Hello, Proxy!");
    }
}
