package org.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class FileIntegrationServiceProxy {

  public FileIntegrationService getFileIntegrationService(Class clazz) {
    return (FileIntegrationService) Proxy.newProxyInstance(clazz.getClassLoader(),
        new Class[]{clazz}, new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (method.getName().contains("save")) {
              System.out.print("Save");
            }
            System.out.println(" method, with params:");
            Arrays.stream(args).map(String::valueOf).forEach(System.out::println);
            return null;
          }
        });
  }
}
